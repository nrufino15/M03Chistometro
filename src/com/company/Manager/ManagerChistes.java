package com.company.Manager;

import com.company.Model.Chiste;


public class ManagerChistes {
    public Chiste[] chistes = new Chiste[10];

    public void crearChiste(String title, String body){
        for (int i = 0; i < chistes.length; i++) {
            if (chistes[i] == null) {
                chistes[i] = new Chiste();
                chistes[i].titulo = title;
                chistes[i].cuerpo = body;
                break;
            }
        }
    }

    public void valorarChiste(int opcion, int valor) {
        int opcionReal = opcion - 1;
        for (int i = 0; i <chistes.length ; i++) {
            if (chistes[opcionReal].valoracion[i] == 0) {
                chistes[opcionReal].valoracion[i] = valor;
            }
        }
    }

    public int mediaValoracion() {
        int cuenta = 0;
        int media = 0;
        for (int i = 0; i <chistes.length ; i++) {
            for (int j = 0; j <chistes[i].valoracion[j] ; j++) {
                cuenta++;
                if (chistes[i].valoracion[i] != 0) {
                    media = (media + chistes[i].valoracion[j])/cuenta;
                }
            }
        }
        return media;
    }


    public void chistesIniciales() {
        crearChiste("Ariel", "¿Porque el mar tiene espuma? Porque la sirenita se llama ARIEL");
        crearChiste("Papa Nole","¿Qué coche usa Papá Noel? Un renol");
        crearChiste("Espejo en chino", "¿Cómo se dice 'espejo' en chino? Aitoiyo");
        crearChiste("El abulo y Windows", "Abuelo, ¿por qué estás delante del ordenador con los ojos cerrados? Es que Windows me ha dicho que cierre las pestañas");
    }

    public boolean verificarChiste(String body){
        for (int i = 0; i < chistes.length; i++) {
            if(chistes[i] != null && chistes[i].cuerpo.equals(body)){
                return false;
            }
        }
        return true;
    }
}
