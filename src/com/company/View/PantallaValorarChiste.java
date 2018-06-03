package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.View.widgets.Mensajes;

import java.util.Scanner;

public class PantallaValorarChiste {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);

        int cuenta = 0;
        Mensajes.mostrarTitol("Chistometro :: Valorar Chiste");
        for (int i = 0; i < managerChistes.chistes.length; i++) {
            if (managerChistes.chistes[i] != null){
                cuenta++;
                Mensajes.mostrarOk("--------------------------------------------------------");
                System.out.println("Numero chiste:" + (i+1));
                System.out.println("Titulo: " + managerChistes.chistes[i].titulo);
            }
        }
        Mensajes.mostrarOk("--------------------------------------------------------");

        boolean esValido = false;

        while(!esValido) {

            System.out.println("¿Que chiste quieres valorar? Selecciona un numero.");
            int opcion = scanner.nextInt();

            if (opcion - 1 < 0 || opcion - 1 > cuenta - 1) {
                Mensajes.mostrarInfo("Tienes que elegir un numero que haya arriba");
                System.out.println();
                Mensajes.mostrarInfo("Pulsa Enter para continuar");
                String enter = scanner.nextLine();
                esValido = false;
            } else {
                System.out.println("¿Que valoracion le quieres dar? (Sobre 5)");
                int valor = scanner.nextInt();

                if (valor > 5 || valor < 1) {
                    Mensajes.mostrarInfo("La valoracion tiene que ser menor de 5 y mayor que 0");
                    System.out.println();
                    Mensajes.mostrarInfo("Pulsa Enter para continuar");
                    String next = scanner.nextLine();
                    esValido = false;
                } else {
                    Mensajes.mostrarOk("Valoracion guardada");
                    System.out.println();
                    Mensajes.mostrarInfo("Pulsa Enter para continuar");
                    String next = scanner.nextLine();
                    managerChistes.valorarChiste(opcion, valor);
                    PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                    pantallaMenuApp.mostrar(managerUsuarios, managerChistes);
                    esValido = true;
                }
            }
        }
    }
}
