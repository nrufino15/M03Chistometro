package com.company.View;

import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaAcceder {
    public void iniciar(ManagerUsuarios managerUsuarios){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        boolean esta = managerUsuarios.verificar(usuario, contraseña);
        if(esta){
            PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
            pantallaMenuApp.mostrar(managerUsuarios);


        }else{
            PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
            pantallaMenuAcceso.iniciar(managerUsuarios);
        }
    }
}