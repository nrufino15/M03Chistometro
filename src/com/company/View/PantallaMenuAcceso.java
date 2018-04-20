package com.company.View;

import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaMenuAcceso {

    public void iniciar(ManagerUsuarios managerUsuarios){
        System.out.println("MyApp :: Menu");
        System.out.println("a) Registrarse");
        System.out.println("b) Acceder");
        Scanner scanner = new Scanner(System.in);
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
