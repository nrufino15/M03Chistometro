package com.company;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.View.PantallaInicio;

public class  Main {

    public static void main(String[] args) throws InterruptedException {

        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        ManagerChistes managerChistes = new ManagerChistes();
        managerChistes.chistesIniciales();
        managerUsuarios.crearUsuario("a", "a", "a", "a");

        PantallaInicio pantallaInicio = new PantallaInicio();
        pantallaInicio.iniciar(managerUsuarios, managerChistes);
    }
}
