package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.View.widgets.Mensajes;

import java.util.Scanner;

public class PantallaCrearChiste {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        boolean esValido = false;

        while (!esValido) {
            Scanner scanner = new Scanner(System.in);

            Mensajes.mostrarTitol("Chistometro :: Crear chiste");
            System.out.print("Titulo: ");
            String title = scanner.nextLine();
            System.out.print("Cuerpo: ");
            String body = scanner.nextLine();

            boolean valido = managerChistes.verificarChiste(body);

            if (title.isEmpty()) {
                System.out.println("No has introducido el titulo");
                esValido = false;
            } else if (body.isEmpty()) {
                System.out.println("No has introducido el cuerpo");
                esValido = false;
            } else if (!valido) {
                System.out.println("No se puede repetir los chistes");
                esValido = false;
            } else {
                managerChistes.crearChiste(title, body);
                Mensajes.mostrarOk("Chiste creado");
                Mensajes.mostrarInfo("Pulsa Enter para continuar");
                String next = scanner.nextLine();
                PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                pantallaMenuApp.mostrar(managerUsuarios, managerChistes);
                esValido = true;
            }
        }
    }
}
