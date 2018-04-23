package com.company.Manager;

import com.company.Model.Chistes;

public class ManagerChiste {

    Chistes[] chistes = new Chiste[100];

    public void crearChiste(String chiste){
        Chistes chistes = new Chistes();
        chiste.chiste = nuevoChiste;

        for (int i = 0; i < chistes.length; i++) {
            if (chistes[i] == null){
                chistes[i] = new Chistes();
            }
        }
    }
}
