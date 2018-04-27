package com.company.View;

import com.company.Manager.ManagerChiste;
import java.util.Scanner;

public class PantallaChiste {
    public void iniciar(ManagerChiste managerChiste){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Chistometro :: Añadir Chiste");
        System.out.print("Confirmar contraseña:");
        String password = scanner.nextLine();
        System.out.println("Introduce el titulo");
        String title = scanner.nextLine();
        System.out.println("Introduce el chiste");
        scanner nuevoChiste = scanner.nextLine();

        managerChiste.crearChiste(title, nuevoChiste);

        boolean verificar = managerChiste.verificarChiste(title, nuevoChiste);

        if (verificar) {

        } else {

        }
    }
}
