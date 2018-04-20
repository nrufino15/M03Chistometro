package com.company.View;

import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaMenuAcceso {

    public void iniciar(ManagerUsuarios managerUsuarios){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chistometro :: Menu");
        System.out.println("a) Registrarse");
        System.out.println("b) Acceder");
        String opcion = scanner.nextLine();


        if("a".equals(opcion)){
            PantallaRegistro pantallaRegistro = new PantallaRegistro();
            pantallaRegistro.iniciar(managerUsuarios);
        } else if("b".equals(opcion)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios);
        }
    }
}
