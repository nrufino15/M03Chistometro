package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PantallaInicio {

    public void iniciar(ManagerUsuarios managerUsuarios, ManagerChistes managerChistes) {

        boolean esValido = false;

        while(!esValido) {
            System.out.println("---------------------------");
            System.out.println("MyApp :: Inicio");
            System.out.println();
            System.out.println("1) Registrarse");
            System.out.println("2) Acceder");
            System.out.println("3) Salir");
            Scanner scanner = new Scanner(System.in);
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
                System.out.println("Debes elegir la opcion correcta, solo números");
                System.out.println("Pulsa cualquier tecla para continuar");
                String next = scanner.nextLine();
                esValido = false;
            }
        }
    }
}
