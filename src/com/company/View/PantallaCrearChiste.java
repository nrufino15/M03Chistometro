package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;

import java.util.Scanner;

public class PantallaCrearChiste {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes, ManagerValoraciones managerValoraciones) throws InterruptedException {
        boolean esValido = false;

        while (!esValido) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("---------------------------");
            System.out.println("Chistometro :: Crear chiste");
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
                System.out.println("Chiste creado");
                Thread.sleep(2000);
                managerChistes.crearChiste(title, body);
                PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                pantallaMenuApp.mostrar(managerUsuarios, managerValoraciones, managerChistes);
                esValido = true;
            }
        }
    }
}
