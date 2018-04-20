package com.company.View;

import com.company.Manager.ManagerChiste;

public class PantallaListarUsuarios {
    public void mostrar(ManagerChiste managerChiste) {
        System.out.println("Lista de Usuarios");

        managerChiste.consultar();

    }
}
