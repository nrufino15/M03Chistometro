package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;


import java.util.Scanner;

public class PantallaVerChiste {
    public void mostrar (ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Chistometro :: Ver Chiste");
        System.out.println();
        for (int i = 0; i < managerChistes.chistes.length; i++) {
            if (managerChistes.chistes[i] != null){
                System.out.println("---------------------------");
                System.out.println("Numero chiste:" + (i+1));
                System.out.println("Titulo: " + managerChistes.chistes[i].titulo);
                System.out.println("Cuerpo: " + managerChistes.chistes[i].cuerpo);
                System.out.println("Valoracion: " + managerChistes.chistes[i].valor);
            }
        }
        System.out.println("---------------------------");

        boolean esValido = false;

        while(!esValido) {
            System.out.println("1) Valorar chiste");
            System.out.println("2) Volver");
            System.out.println("3) Log out");
            System.out.println("4) Salir");
            String option = scanner.nextLine();

            if ("1".equals(option)) {
                PantallaValorarChiste pantallaValorarChiste = new PantallaValorarChiste();
                pantallaValorarChiste.iniciar(managerUsuarios, managerChistes);
            } else if ("2".equals(option)) {
                PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                pantallaMenuApp.mostrar(managerUsuarios, managerChistes);
                esValido = true;
            } else if ("3".equals(option)) {
                PantallaInicio pantallaInicio = new PantallaInicio();
                pantallaInicio.iniciar(managerUsuarios, managerChistes);
                esValido = true;
            } else if ("4".equals(option)) {
                System.out.println("Hasta luego");
                esValido = true;
            } else{
                System.out.println("Error opcion no valida");
                System.out.print("Pulsa una tecla para continuar");
                String next = scanner.nextLine();
                esValido = false;
            }
        }
    }
}
  