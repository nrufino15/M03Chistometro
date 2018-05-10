package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;

import java.util.Scanner;

public class PantallaMenuAcceso {

    public void iniciar(ManagerUsuarios managerUsuarios, ManagerValoraciones managerValoraciones, ManagerChistes managerChistes){
        System.out.println("---------------------------");
        System.out.println("MyApp :: Menu");
        System.out.println("a) Registrarse");
        System.out.println("b) Acceder");
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();


        if("a".equals(opcion) || "A".equals(opcion)){
            PantallaRegistro pantallaRegistro = new PantallaRegistro();
            pantallaRegistro.iniciar(managerUsuarios, managerValoraciones, managerChistes);
        } else if("b".equals(opcion) || "B".equals(opcion)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios, managerValoraciones, managerChistes);
        }
    }
}
