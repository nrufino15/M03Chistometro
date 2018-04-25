package com.company.Manager;

import com.company.Model.Chiste;


public class ManagerChiste {
    Chiste[] chistes = new Chiste[10];

    public void crearChiste(String title, String nuevoChiste){
        Chiste chiste = new Chiste();
        chiste.titulo = title;
        chiste.cuerpo = nuevoChiste;

        for (int i = 0; i < chistes.length; i++) {
            if (chistes[i] == null) {
                 chistes[i] = chiste;
                break;
            }
        }

    }

    public boolean verificarChiste(String title, String nuevoChiste){
        for (int i = 0; i < chistes.length; i++) {
            if(chistes[i] != null && chistes[i].titulo.equals(title) && chistes[i].cuerpo.equals(nuevoChiste)){
                return false;
            }
        }
        return true;
    }
}
