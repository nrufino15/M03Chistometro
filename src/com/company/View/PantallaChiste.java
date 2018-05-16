package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;

import java.util.Scanner;

public class PantallaChiste {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes, ManagerValoraciones managerValoraciones) throws InterruptedException {

        boolean esValido = false;

        while(!esValido) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("---------------------------");
            System.out.println("Chistometro :: Chistes");
            System.out.println();
            System.out.println("1) Crear chiste");
            System.out.println("2) Volver");
            System.out.println("3) Log out");
            System.out.println("4) Salir");
            String option = scanner.nextLine();

            if ("1".equals(option)) {
                PantallaCrearChiste pantallaCrearChiste = new PantallaCrearChiste();
                pantallaCrearChiste.iniciar(managerUsuarios, managerChistes, managerValoraciones);
                esValido = true;
            } else if ("2".equals(option)) {
                PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                pantallaMenuApp.mostrar(managerUsuarios, managerValoraciones, managerChistes);
                esValido = true;
            } else if ("3".equals(option)) {
                PantallaAcceder pantallaAcceder = new PantallaAcceder();
                pantallaAcceder.iniciar(managerUsuarios, managerValoraciones, managerChistes);
                esValido = true;
            } else if ("4".equals(option)) {
                System.out.println("Hasta luego");
                esValido = true;
            } else{
                System.out.println("Error opcion no valida");
                Thread.sleep(2000);
                PantallaChiste pantallaChiste = new PantallaChiste();
                pantallaChiste.iniciar(managerUsuarios, managerChistes, managerValoraciones);
                esValido = true;
            }
        }

    }
}
