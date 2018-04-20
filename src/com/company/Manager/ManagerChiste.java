package com.company.Manager;

import com.company.Model.Chiste;

public class ManagerChiste {

    Chiste[] chistes = new Chiste[100];

    public void crearChiste(String nombre, String apellido){
        for (int i = 0; i < chistes.length; i++) {
            if (chistes[i] == null){
                chistes[i] = new Chiste();

            }

        }
    }

    public void consultar(){
        return chistes[0];
    }

}
