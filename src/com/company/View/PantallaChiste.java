package com.company.View;

import com.company.Manager.ManagerChiste;
import com.company.Manager.ManagerUsuarios;
import java.util.Scanner;

public class PantallaChiste {
    public void iniciar(ManagerChiste managerChiste, ManagerUsuarios managerUsuarios){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Chistometro :: Añadir Chiste");
        System.out.print("Confirmar contraseña:");
        String password = scanner.nextLine();
        boolean verificarPassword = managerUsuarios.verificarPassword(password);


        if (verificarPassword) {
            PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
            pantallaMenuApp.mostrar(managerUsuarios, managerChiste);
        } else {
            PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
            pantallaMenuAcceso.iniciar(managerUsuarios, managerChiste);
        }

        System.out.println("Contraseña incorrecta");
        System.out.println("Vuelve a introducir la contraseña:");
        String password = scanner.nextLine();

        System.out.println("Introduce el titulo");
        String title = scanner.nextLine();
        System.out.println("Introduce el chiste");
        scanner nuevoChiste = scanner.nextLine();

        boolean verificarChiste = managerChiste.verificarChiste(title, nuevoChiste);
        managerChiste.crearChiste(title, nuevoChiste);





    }
}
