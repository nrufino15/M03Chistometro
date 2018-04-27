package com.company.View;

import com.company.Manager.ManagerChiste;
import com.company.Manager.ManagerUsuarios;
import java.util.Scanner;

public class PantallaMenuApp {

    public void mostrar(ManagerUsuarios managerUsuarios, ManagerChiste managerChiste) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Chistometro");
        System.out.println("a) Añadir Chiste ");
        System.out.println("b) Valorar chiste ");
        System.out.println("c) Ranking ");
        System.out.println("d) Premios ");
        String option = scanner.nextLine();

        if("a".equals(option)){
            PantallaChiste pantallaChiste = new PantallaChiste();
            pantallaChiste.iniciar(managerChiste);
        } else if ("b".equals(option)){
            PantallaValorarChiste pantallaValorarChiste = new PantallaValorarChiste();
            pantallaValorarChiste.mostrar();
        } else if ("c".equals(option)){
            PantallaRanking pantallaRanking = new PantallaRanking();
            pantallaRanking.iniciar();
        }else if ("d".equals(option)){
            PantallaPremios pantallaPremios = new PantallaPremios();
            pantallaPremios.iniciar();
        }

    }
}
