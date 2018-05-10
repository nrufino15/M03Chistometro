package com.company.View;

import com.company.Manager.ManagerChistes;
import com.company.Manager.ManagerUsuarios;
import com.company.Manager.ManagerValoraciones;

public class PantallaRanking {
    public void iniciar(ManagerValoraciones managerValoraciones, ManagerUsuarios managerUsuarios, ManagerChistes managerChistes){



        System.out.println("1"   );
        System.out.println("2"   //Valoracion    Chiste
        );
        System.out.println("3"   //Valoracion    Chiste
        );

        PantallaPremios pantallaPremios = new PantallaPremios();
        pantallaPremios.iniciar();
    }
}
