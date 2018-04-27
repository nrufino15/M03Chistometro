package com.company;

import com.company.Manager.ManagerChiste;
import com.company.Manager.ManagerUsuarios;
import com.company.View.PantallaMenuAcceso;

public class  Main {

    public static void main(String[] args) {

        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        ManagerChiste managerChiste = new ManagerChiste();

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.iniciar(managerUsuarios, managerChiste);
    }
}
