package com.company.View;

import com.company.Manager.ManagerChiste;
import com.company.Model.Chiste;

import java.util.Scanner;

public class PantallaChistes {



    public void mostrar(ManagerChiste managerChiste){
        System.out.println("PANTALLA CHISTE");

        Scanner scanner = new Scanner(System.in);

        System.out.println("ALUMNOS");
        System.out.println("Introduzca el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca el apellido");
        String apellido = scanner.nextLine();


        managerChiste.crear(nombre, apellido);

        Chiste chiste56 = managerChiste.consultar();

        System.out.println("Chiste creado");
    }
}
