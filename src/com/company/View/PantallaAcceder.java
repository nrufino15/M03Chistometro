package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;

import java.util.Scanner;

public class PantallaAcceder {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerValoraciones managerValoraciones, ManagerChistes managerChistes) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Chistometro :: Acceder");
        System.out.print("Usuario: ");
        String username = scanner.nextLine();
        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        boolean verificar = managerUsuarios.verificar(username, password);
        if(verificar){
            PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
            pantallaMenuApp.mostrar(managerUsuarios, managerValoraciones, managerChistes);
        }else{
            System.out.println();
            System.out.println("Usuario no encontrado, Registrate antes");
            Thread.sleep(2000);
            PantallaInicio pantallaInicio = new PantallaInicio();
            pantallaInicio.iniciar(managerUsuarios, managerValoraciones, managerChistes);
        }
    }
}
