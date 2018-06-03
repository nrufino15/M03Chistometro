package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.View.widgets.Mensajes;

import java.util.Scanner;

public class PantallaPremios {
    public void iniciar(ManagerChistes managerChistes, ManagerUsuarios managerUsuarios){
        Mensajes.mostrarTitol("Chistometro :: Premios");
        Mensajes.mostrarInfo("En construccion vuelva mas tarde, o tal vez nunca.");
        Scanner scanner = new Scanner(System.in);
        boolean esValido = false;
        while (!esValido) {
            System.out.println("1) Volver");
            System.out.println("2) Log out");
            System.out.println("3) Salir");
            String option = scanner.nextLine();
            System.out.println();

            if ("1".equals(option)) {
                PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                pantallaMenuApp.mostrar(managerUsuarios, managerChistes);
                esValido = true;
            } else if ("2".equals(option)) {
                boolean confirmar = false;
                while (!confirmar) {
                    Mensajes.mostrarError("¿Seguro que quiere cerrar sesion?");
                    String opcion = scanner.nextLine();
                    if (opcion.equals("N") || opcion.equals("n") || opcion.equals("No") || opcion.equals("NO") || opcion.equals("no")) {
                        PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                        pantallaMenuApp.mostrar(managerUsuarios, managerChistes);
                        confirmar = true;
                    } else if (opcion.equals("S") || opcion.equals("s") || opcion.equals("Si") || opcion.equals("SI")  || opcion.equals("si")) {
                        Mensajes.mostrarInfo("Sesion cerrada, pulsa Enter para continuar");
                        PantallaInicio pantallaInicio = new PantallaInicio();
                        String next = scanner.nextLine();
                        pantallaInicio.iniciar(managerUsuarios, managerChistes);
                        confirmar = true;
                    } else {
                        Mensajes.mostrarError("Debe escribir <<N/n/No/NO/no>> para cancelar o <<S/s/Si/SI/si>> para confirmar");
                        confirmar = false;
                    }
                    esValido = true;
                }
            } else if ("3".equals(option)) {
                Mensajes.mostrarInfo("Hasta luego");
                esValido = true;
            } else {
                Mensajes.mostrarError("Error opcion no valida");
                System.out.println();
                Mensajes.mostrarInfo("Pulsa Enter para continuar");
                String next = scanner.nextLine();
                esValido = false;
            }
        }

    }
}
