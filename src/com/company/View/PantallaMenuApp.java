package com.company.View;

import com.company.Manager.ManagerChiste;
import com.company.Manager.ManagerUsuarios;
import com.company.Model.Chiste;

import java.util.Scanner;

public class PantallaMenuApp {

    public void mostrar(ManagerUsuarios managerUsuarios) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chistometro");
        System.out.print("a) Añadir Chiste ");
        System.out.print("b) Valorar chiste ");
        System.out.print("c) Ranking ");
        System.out.print("d) Premios ");
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
