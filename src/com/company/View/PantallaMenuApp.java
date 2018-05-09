package com.company.View;

import com.company.Manager.ManagerChiste;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoracion;

import java.util.Scanner;

public class PantallaMenuApp {

    public void mostrar(ManagerUsuarios managerUsuarios, ManagerValoracion managerValoracion) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Chistometro");
        System.out.println("a) Añadir Chiste ");
        System.out.println("b) Valorar chiste ");
        System.out.println("c) Ranking ");
        System.out.println("d) Premios ");
        String option = scanner.nextLine();

        String opcion = scanner.nextLine();
        if ("a".equals(opcion) || "A".equals(opcion) ) {
            PantallaChiste pantallaChiste = new PantallaChiste();
            pantallaChiste.iniciar(managerUsuarios);

        } else if ("b".equals(opcion)|| "B".equals(opcion)) {
            PantallaValorarChiste pantallaValorarChiste = new PantallaValorarChiste();
            pantallaValorarChiste.mostrar();

        } else if ("c".equals(opcion)|| "C".equals(opcion)) {
            PantallaRanking pantallaRanking = new PantallaRanking();
            pantallaRanking.iniciar(managerValoracion);

        } else if ("d".equals(opcion)|| "D".equals(opcion)) {
            PantallaPremios pantallaPremios = new PantallaPremios();
            pantallaPremios.iniciar();

        }else{
            System.out.println("Error opcion no valida");
            PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
            pantallaMenuApp.mostrar(managerUsuarios, managerValoracion);

        }

    }
}
