package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.View.widgets.Mensajes;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PantallaVerChiste {
    public void mostrar (ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);

        Mensajes.mostrarTitol("Chistometro :: Ver chiste");
        for (int i = 0; i < managerChistes.chistes.length; i++) {
            if (managerChistes.chistes[i] != null){
                Mensajes.mostrarOk("--------------------------------------------------------");
                System.out.println();
                System.out.println("Numero chiste:" + (i+1));
                System.out.println("Titulo: " + managerChistes.chistes[i].titulo);
                System.out.println("Cuerpo: " + managerChistes.chistes[i].cuerpo);
                System.out.println("Valoracion: " + managerChistes.chistes[i].valoracion[i]);
                System.out.println();
            }
        }
        Mensajes.mostrarOk("--------------------------------------------------------");

        boolean esValido = false;

        while(!esValido) {
            System.out.println("1) Valorar chiste");
            System.out.println("2) Volver");
            System.out.println("3) Log out");
            System.out.println("4) Salir");
            String option = scanner.nextLine();

            if ("1".equals(option)) {
                PantallaValorarChiste pantallaValorarChiste = new PantallaValorarChiste();
                pantallaValorarChiste.iniciar(managerUsuarios, managerChistes);
            } else if ("2".equals(option)) {
                PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                pantallaMenuApp.mostrar(managerUsuarios, managerChistes);
                esValido = true;
            } else if ("3".equals(option)) {
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
            } else if ("4".equals(option)) {
                Mensajes.mostrarInfo("Hasta luego");
                esValido = true;
            } else{
                Mensajes.mostrarError("Error opcion no valida");
                System.out.println();
                Mensajes.mostrarInfo("Pulsa Enter para continuar");
                String next = scanner.nextLine();
                esValido = false;
            }
        }
    }
}
  