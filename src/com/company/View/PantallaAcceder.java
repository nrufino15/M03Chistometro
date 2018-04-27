package com.company.View;

import com.company.Manager.ManagerChiste;
import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaAcceder {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChiste managerChiste){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Chistometro :: Acceder");
        System.out.print("Usuario: ");
        String username = scanner.nextLine();
        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        boolean verificar = managerUsuarios.verificar(username, password);

        if (verificar) {
            PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
            pantallaMenuApp.mostrar(managerUsuarios, managerChiste);
        } else {
            PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
            pantallaMenuAcceso.iniciar(managerUsuarios, managerChiste);
        }
    }
}