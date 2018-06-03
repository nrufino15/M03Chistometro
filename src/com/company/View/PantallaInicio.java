package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.View.widgets.Mensajes;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PantallaInicio {

    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {
        Scanner scanner = new Scanner(System.in);
        boolean esValido = false;

        while(!esValido) {
            Mensajes.mostrarTitol("MyApp :: Inicio");
            System.out.println("1) Registrarse");
            System.out.println("2) Acceder");
            System.out.println("3) Salir");
            String opcion = scanner.nextLine();


            if("1".equals(opcion)){
                PantallaRegistro pantallaRegistro = new PantallaRegistro();
                pantallaRegistro.iniciar(managerUsuarios, managerChistes);
                esValido = true;
            } else if("2".equals(opcion)){
                PantallaAcceder pantallaAcceder = new PantallaAcceder();
                pantallaAcceder.iniciar(managerUsuarios, managerChistes);
                esValido = true;
            } else if("3".equals(opcion)){
                System.out.println("Hasta luego");
                esValido = true;
            } else {
                Mensajes.mostrarError("Debes elegir la opcion correcta, solo números");
                System.out.println();
                Mensajes.mostrarInfo("Pulsa Enter para continuar");
                String next = scanner.nextLine();
                esValido = false;
            }
        }
    }
}
