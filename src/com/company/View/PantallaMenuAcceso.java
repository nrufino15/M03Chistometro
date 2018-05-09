package com.company.View;

import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoracion;

import java.util.Scanner;

public class PantallaMenuAcceso {

    public void iniciar(ManagerUsuarios managerUsuarios, ManagerValoracion managerValoracion){
        System.out.println("---------------------------");
        System.out.println("MyApp :: Menu");
        System.out.println("a) Registrarse");
        System.out.println("b) Acceder");
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();


        if("a".equals(opcion) || "A".equals(opcion)){
            PantallaRegistro pantallaRegistro = new PantallaRegistro();
            pantallaRegistro.iniciar(managerUsuarios, managerValoracion);
        } else if("b".equals(opcion) || "B".equals(opcion)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios, managerValoracion);
        }
    }
}
