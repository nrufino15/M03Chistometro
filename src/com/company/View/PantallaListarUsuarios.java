package com.company.View;

import com.company.Manager.ManagerUsuarios;

public class PantallaListarUsuarios {
    public void mostrar(ManagerUsuarios managerUsuarios) {
        System.out.println("Lista de Usuarios");

        managerUsuarios.consultar();

    }
}
