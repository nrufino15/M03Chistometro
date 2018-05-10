package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;


import java.util.Scanner;

public class PantallaValorarChiste {
    public void mostrar (ManagerChistes managerChistes, ManagerUsuarios managerUsuarios, ManagerValoraciones managerValoraciones){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valorar Chiste");

        System.out.println("Valoracion:");

        System.out.println("Otro Chiste?");
        String si = scanner.nextLine();



        if ("si".equals(si) ) {
             PantallaChiste pantallaChiste = new PantallaChiste();
             pantallaChiste.iniciar(managerChistes);

        }else if ("No"!=(si)){
            PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
            pantallaMenuApp.mostrar(managerValoraciones);
        }
    }
}
  