package com.company.Manager;

import com.company.Model.Usuario;


public class ManagerUsuarios {
    public Usuario[] usuarios = new Usuario[100];

    public void crearUsuario(String firstname, String lastname, String username, String password) {
        Usuario usuario = new Usuario();
        usuario.firstName = firstname;
        usuario.lastName = lastname;
        usuario.nickname = username;
        usuario.password = password;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                break;
            }
        }
    }

    public boolean verificar(String username, String pass){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null && usuarios[i].nickname.equals(username) && usuarios[i].password.equals(pass)){
                return true;
            }
        }
        return false;
    }

    public boolean verificarRegistro(String username){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null && usuarios[i].nickname.equals(username)){
                return true;
            }
        }
        return false;
    }
}
