package com.company;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;
import com.company.View.PantallaInicio;

public class  Main {

    public static void main(String[] args) throws InterruptedException {

        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        ManagerValoraciones managerValoraciones = new ManagerValoraciones();

        ManagerChistes managerChistes = new ManagerChistes();
        managerUsuarios.crearUsuario("a","a");


        PantallaInicio pantallaInicio = new PantallaInicio();
        pantallaInicio.iniciar(managerUsuarios, managerValoraciones, managerChistes);
    }
}
