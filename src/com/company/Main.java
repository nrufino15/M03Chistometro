package com.company;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;
import com.company.View.PantallaMenuAcceso;

public class  Main {

    public static void main(String[] args) {

        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        ManagerValoraciones managerValoraciones = new ManagerValoraciones();

        ManagerChistes managerChistes = new ManagerChistes();


        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.iniciar(managerUsuarios, managerValoraciones, managerChistes);
    }
}
