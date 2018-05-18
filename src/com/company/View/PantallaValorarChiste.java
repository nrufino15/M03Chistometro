package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;
import sun.text.bidi.BidiBase;


import java.util.Scanner;

public class PantallaValorarChiste {
    public void mostrar (ManagerChistes managerChistes, ManagerUsuarios managerUsuarios, ManagerValoraciones managerValoraciones) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valorar Chiste");


        for (int i = 0; i < managerChistes.chistes.length; i++) {
            if (managerChistes.chistes[i] != null){
                System.out.println("titulo \t" + managerChistes.chistes[i].titulo);
                System.out.println("cuerpo \t" + managerChistes.chistes[i].cuerpo);

                System.out.println("Valoracion:");
                String vzlorzcio = scanner.nextLine();


                System.out.println("Otro Chiste?");
                String option = scanner.nextLine();



                if ("no".equals(option) || "No".equals(option)){
                    PantallaMenuApp pantallaMenuApp = new PantallaMenuApp();
                    pantallaMenuApp.mostrar(managerUsuarios, managerValoraciones, managerChistes);
                }else{

                }
            }

        }



    }
}
  