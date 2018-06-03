package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.View.widgets.Mensajes;

import java.util.Scanner;

public class PantallaAcceder {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);

        Mensajes.mostrarTitol("Chistometro :: Acceder");
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
            Mensajes.mostrarError("El usario o la contraseña son incorrectos");
            System.out.println();
            Mensajes.mostrarInfo("Pulsa Enter para continuar");
            String next = scanner.nextLine();
            PantallaInicio pantallaInicio = new PantallaInicio();
            pantallaInicio.iniciar(managerUsuarios, managerChistes);
        }
    }
}
