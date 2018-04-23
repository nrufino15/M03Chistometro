package com.company.View;

import com.company.Manager.ManagerUsuarios;
import java.util.Scanner;

public class PantallaMenuApp {

    public void mostrar(ManagerUsuarios managerUsuarios) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chistometro");
        System.out.println("a) Añadir Chiste ");
        System.out.println("b) Valorar chiste ");
        System.out.println("c) Ranking ");
        System.out.println("d) Premios ");
        String option = scanner.nextLine();



        if("a".equals(option)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios);
        } else if("b".equals(option)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios);
        } else if("c".equals(option)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios);
        }else if("d".equals(option)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios);
        }

    }
}
