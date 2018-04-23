package com.company.View;

import com.company.Manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaChiste {
    public void iniciar(ManagerUsuarios managerUsuarios){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Chistometro :: Añadir Chiste");
        System.out.print("Confirmar contraseña:");
        String password = scanner.nextLine();

        boolean verificar = managerUsuarios.verificar(password);

        while (!verificar) {
            System.out.println("Error, vuelva a introducir la contraseña");
            if (!verificar) {
                return false;
            }
            return true;
        }

        System.out.println("Introduce el chiste");
        String nuevoChiste = scanner.nextLine();
    }
}
