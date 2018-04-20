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
        String a = scanner.nextLine();
        System.out.print("b) Valorar chiste ");
        String b = scanner.nextLine();
        System.out.print("c) Ranking ");
        String c = scanner.nextLine();
        System.out.print("d) Premios ");
        String d = scanner.nextLine();



        if("a".equals(a)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios);
        } else if("b".equals(b)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios);
        } else if("c".equals(c)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios);
        }else if("d".equals(d)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios);
        }

    }
}
