package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;


import java.util.Scanner;

public class PantallaValorarChiste {
    public void mostrar (ManagerChistes managerChistes, ManagerUsuarios managerUsuarios, ManagerValoraciones managerValoraciones) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valorar Chiste");

        System.out.println("Valoracion:");

        System.out.println("Otro Chiste?");
        String option = scanner.nextLine();



        if ("si".equals(option) || "Si".equals(option)) {
             PantallaChiste pantallaChiste = new PantallaChiste();
             pantallaChiste.iniciar(managerUsuarios, managerChistes, managerValoraciones);

        }else if ("no".equals(option) || "No".equals(option)){
            PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
            pantallaMenuApp.mostrar(managerUsuarios, managerValoraciones, managerChistes);
        }
    }
}
  