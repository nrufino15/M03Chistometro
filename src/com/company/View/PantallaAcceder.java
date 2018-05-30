package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaAcceder {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Chistometro :: Acceder");
        System.out.println();
        System.out.print("Usuario: ");
        String username = scanner.nextLine();
        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        boolean verificar = managerUsuarios.verificar(username, password);
        if(verificar){
            PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
            pantallaMenuApp.mostrar(managerUsuarios, managerChistes);
        }else{
            System.out.println();
            System.out.println("Usuario no encontrado, Registrate antes");
            System.out.println("Pulsa cualquier tecla para continuar");
            String next = scanner.nextLine();
            PantallaInicio pantallaInicio = new PantallaInicio();
            pantallaInicio.iniciar(managerUsuarios, managerChistes);
        }
    }
}
