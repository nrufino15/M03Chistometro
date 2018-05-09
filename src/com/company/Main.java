package com.company;

import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoracion;
import com.company.View.PantallaMenuAcceso;

public class  Main {

    public static void main(String[] args) {

        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        ManagerValoracion managerValoracion = new ManagerValoracion();

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.iniciar(managerUsuarios, managerValoracion);
    }
}
