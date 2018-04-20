package com.company.View;

import com.company.Manager.ManagerChiste;

import java.util.Scanner;

public class PantallaChiste {
    public void mostrar(ManagerChiste managerChiste) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pantalla Chiste");
        System.out.println("Introduce nombre de usuario: ");
        String nombre = scanner.nextLine();
        System.out.println("Introducir apellido del usuario");
        String  apellido = scanner.nextLine();
        System.out.println("Introduce el titulo del chiste: ");
        String titulo = scanner.nextLine();
        System.out.println("Introduce el cuerpo del chiste: ");
        String cuerpo = scanner.nextLine();

        managerChiste.crearUsuario(nombre, apellido);
        managerChiste.crearChiste(titulo, cuerpo);

        managerChiste.consultar();

        System.out.println("Usuario creado.");
    }
}
