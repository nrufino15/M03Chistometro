package com.company.Manager;

import com.company.Model.Chistes;


public class ManagerChiste {
    Chistes[] chistes = new Chistes[10];

    public void crearChiste(String chiste){
        Usuario usuario = new Usuario();
        usuario.firstName = firstName;
        usuario.lastName = lastName;
        usuario.nickname = username;
        usuario.password = password;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                break;
            }
        }

    }

    public boolean verificarChiste(String nuevoChiste) {
        for (int i = 0; i <chistes.length; i++) {
            if (chistes[i] != null && chistes[i].chiste)

        }
    }
}
