package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;

import java.util.Scanner;

public class PantallaMenuApp {

    public void mostrar(ManagerUsuarios managerUsuarios, ManagerValoraciones managerValoraciones, ManagerChistes managerChistes) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Chistometro :: Menu");
        System.out.println();
        System.out.println("1) Añadir Chiste ");
        System.out.println("2) Ver y valorar chiste ");
        System.out.println("3) Ranking ");
        System.out.println("4) Premios ");
        System.out.println("5) Log out");
        System.out.println("6) Salir");
        String option = scanner.nextLine();


        if ("1".equals(option)) {
            PantallaChiste pantallaChiste = new PantallaChiste();
            pantallaChiste.iniciar(managerUsuarios, managerChistes, managerValoraciones);
        } else if ("2".equals(option)) {
            PantallaValorarChiste pantallaValorarChiste = new PantallaValorarChiste();
            pantallaValorarChiste.mostrar(managerChistes, managerUsuarios, managerValoraciones);

        } else if ("3".equals(option)) {
            PantallaRanking pantallaRanking = new PantallaRanking();
            pantallaRanking.iniciar(managerValoraciones, managerUsuarios, managerChistes);

        } else if ("4".equals(option)) {
            PantallaPremios pantallaPremios = new PantallaPremios();
            pantallaPremios.iniciar(managerChistes, managerValoraciones, managerUsuarios);

        } else if ("5".equals(option)) {
            PantallaInicio pantallaInicio = new PantallaInicio();
            pantallaInicio.iniciar(managerUsuarios, managerValoraciones, managerChistes);

        } else if ("6".equals(option)) {
            System.out.println("-------------------------");
            System.out.println("Hasta luego Lucas");
        } else{
            System.out.println("Error opcion no valida");
            Thread.sleep(2000);
            PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
            pantallaMenuApp.mostrar(managerUsuarios, managerValoraciones, managerChistes);
        }

    }
}
