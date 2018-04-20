package com.company.View;

import com.company.Manager.ManagerChiste;
import com.company.Model.Chiste;

import java.util.Scanner;

public class PantallaChistes {



    public void mostrar(ManagerChiste managerChiste){
        System.out.println("PANTALLA CHISTE");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el titulo del chiste: ");
        String title = scanner.nextLine();
        System.out.println("Introduce el cuerpo del chiste: ");
        String body = scanner.nextLine();


        managerChiste.crearChiste(title, body);

        System.out.println("Chiste creado");
    }
}
