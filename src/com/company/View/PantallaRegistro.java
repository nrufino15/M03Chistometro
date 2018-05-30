package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaRegistro {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);

        boolean esValido = false;
        while (!esValido) {
            System.out.println("---------------------------");


            System.out.println("MyApp :: Registro");
            System.out.println();
            System.out.print("Nombre: ");
            String firstname = scanner.nextLine();
            System.out.print("Apellido: ");
            String lastname = scanner.nextLine();

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String password = scanner.nextLine();



            if (firstname.isEmpty() || lastname.isEmpty() || usuario.isEmpty() || password.isEmpty()) {
                System.out.println("Todos los campos son obligatorios");
                esValido = false;
            } else {
                managerUsuarios.crearUsuario(firstname, lastname, usuario, password);
                PantallaInicio pantallaInicio = new PantallaInicio();
                pantallaInicio.iniciar(managerUsuarios, managerChistes);
                esValido = true;
            }
        }
    }
}
