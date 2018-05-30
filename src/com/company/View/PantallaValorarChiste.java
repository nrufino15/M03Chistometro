package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaValorarChiste {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);

        int cuenta = 0;
        System.out.println("---------------------------");
        System.out.println("Chistometro :: Valorar Chiste");
        System.out.println();
        for (int i = 0; i < managerChistes.chistes.length; i++) {
            if (managerChistes.chistes[i] != null){
                cuenta++;
                System.out.println("---------------------------");
                System.out.println("Numero chiste:" + (i+1));
                System.out.println("Titulo: " + managerChistes.chistes[i].titulo);
            }
        }
        System.out.println("---------------------------");

        boolean esValido = false;

        while(!esValido) {

            System.out.println("¿Que chiste quieres valorar? Selecciona un numero.");
            int opcion = scanner.nextInt();

            if (opcion - 1 < 0 || opcion-1 > (cuenta - 1)) {
                System.out.println("Tienes que elegir un nuemro que haya arriba");
                esValido = false;
            } else {
                System.out.println("¿Que valoracion le quieres dar? (Sobre 5)");
                int valor = scanner.nextInt();

                if (valor > 5 || valor < 0) {
                    System.out.println("La valoracion tiene que ser menor de 5");
                    esValido = false;
                } else {
                    managerChistes.valorarChiste(opcion, valor);
                    PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                    pantallaMenuApp.mostrar(managerUsuarios, managerChistes);
                    esValido = true;
                }
            }
        }
    }
}
