package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;

import java.util.Scanner;

public class PantallaRegistro {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerValoraciones managerValoraciones, ManagerChistes managerChistes) throws InterruptedException {
        boolean esValido = false;

        while (!esValido) {
            System.out.println("---------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("MyApp :: Registro");
            System.out.print("Nombre: ");
            String firstname = scanner.nextLine();
            System.out.print("Apellido: ");
            String lastname = scanner.nextLine();

            boolean nombreValido = false;
            char[] isNumeric = "012346789".toCharArray();


            while (!nombreValido) {

//                for (int i = 0; i <firstname.length() ; i++) {
//                    if (firstname.charAt(i) = isNumeric) {
//                        nombreValido = true;
//                    } else {
//                        nombreValido = false;
//                    }
//                }
            }

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String password = scanner.nextLine();



            if (firstname.isEmpty() || lastname.isEmpty() || usuario.isEmpty() || password.isEmpty()) {
                System.out.println("Todos los campos son obligatorios");
                esValido = false;
            } else {
                managerUsuarios.crearUsuario(firstname, lastname, usuario, password);
                PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
                pantallaMenuAcceso.iniciar(managerUsuarios, managerValoraciones, managerChistes);
                esValido = true;
            }
        }
    }
}
