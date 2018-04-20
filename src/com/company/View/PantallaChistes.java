package com.company.View;

import com.company.Manager.ManagerChiste;
import com.company.Model.Chiste;

import java.util.Scanner;

public class PantallaChistes {



    public void mostrar(ManagerChiste managerChiste){
        System.out.println("PANTALLA CHISTE");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pantalla creacion de chistes");
        System.out.println("Introduzca el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca el apellido");
        String apellido = scanner.nextLine();
        System.out.println("Introduce el titulo del chiste: ");
        String titulo = scanner.nextLine();
        System.out.println("Introduce el cuerpo del chiste: ");
        String cuerpo = scanner.nextLine();


        managerChiste.crear(nombre, apellido);

        Chiste chiste56 = managerChiste.consultar();

        System.out.println("Chiste creado");
    }
}
