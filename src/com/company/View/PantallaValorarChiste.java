package com.company.View;

import com.company.Manager.ManagerChiste;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoracion;


import java.util.Scanner;

public class PantallaValorarChiste {
    public void mostrar (ManagerChiste managerChiste, ManagerUsuarios managerUsuarios, ManagerValoracion managerValoracion){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valorar Chiste");

        System.out.println("Valoracion:");

        System.out.println("Otro Chiste?");
        String si = scanner.nextLine();






        if ("si".equals(si) ) {
         PantallaChiste pantallaChiste = new PantallaChiste();
         pantallaChiste.iniciar(managerChiste);

        }else if ("No"!=(si)){
        PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
        pantallaMenuApp.mostrar(managerValoracion);
        }


    }

}
  