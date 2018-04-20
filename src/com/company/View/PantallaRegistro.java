package com.company.View;

import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaRegistro {
    public void iniciar(ManagerUsuarios managerUsuarios){
        Scanner scanner = new Scanner(System.in);
        System.out.println("MyApp :: Registro");
        System.out.print("Nombre: ");
        String firstName = scanner.nextLine();
        System.out.print("Apellido: ");
        String  lastName = scanner.nextLine();

        System.out.print("Usuario: ");
        String username = scanner.nextLine();
        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        managerUsuarios.crearUsuario(username, password);

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.iniciar(managerUsuarios);
    }
}
