package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaMenuApp {

    public void mostrar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);

        boolean esValido = false;
        while (!esValido) {
            System.out.println("-------------------------");
            System.out.println("Chistometro :: Menu");
            System.out.println();
            System.out.println("1) Añadir Chiste ");
            System.out.println("2) Ver y valorar chistes ");
            System.out.println("3) Premios ");
            System.out.println("4) Log out");
            System.out.println("5) Salir");
            String option = scanner.nextLine();


            if ("1".equals(option)) {
                PantallaChiste pantallaChiste = new PantallaChiste();
                pantallaChiste.iniciar(managerUsuarios, managerChistes);
                esValido = true;
            } else if ("2".equals(option)) {
                PantallaVerChiste pantallaValorarChiste = new PantallaVerChiste();
                pantallaValorarChiste.mostrar(managerUsuarios, managerChistes);
                esValido = true;
            } else if ("3".equals(option)) {
                PantallaPremios pantallaPremios = new PantallaPremios();
                pantallaPremios.iniciar(managerChistes, managerUsuarios);
                esValido = true;
            } else if ("4".equals(option)) {
                PantallaInicio pantallaInicio = new PantallaInicio();
                pantallaInicio.iniciar(managerUsuarios, managerChistes);
                esValido = true;
            } else if ("5".equals(option)) {
                System.out.println("Hasta luego lucas");
                esValido = true;
            } else {
                System.out.println("Error opcion no valida");
                esValido = false;
            }
        }
    }
}
