package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.View.widgets.Mensajes;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PantallaRegistro {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);

        boolean esValido = false;
        while (!esValido) {
            Mensajes.mostrarTitol("MyApp :: Registro");
            System.out.print("Nombre: ");
            String firstname = scanner.nextLine();
            System.out.print("Apellido: ");
            String lastname = scanner.nextLine();
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

            boolean verificar = managerUsuarios.verificarRegistro(usuario);
            if (firstname.isEmpty() || lastname.isEmpty() || usuario.isEmpty() || password.isEmpty()) {
                Mensajes.mostrarError("Todos los campos son obligatorios");
                System.out.println();
                Mensajes.mostrarInfo("Pulsa Enter para continuar");
                String next = scanner.nextLine();
                esValido = false;
            } else if (verificar) {
                System.out.println();
                Mensajes.mostrarError("No se puede repedir el nombre de usuario");
                System.out.println();
                Mensajes.mostrarInfo("Pulsa Enter para continuar");
                String next = scanner.nextLine();
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
