package com.company.Manager;

import com.company.Model.Usuario;


public class ManagerUsuarios {
    Usuario[] usuarios = new Usuario[100];

    public void crearUsuario(String nombre, String contraseña) {
        Usuario usuario = new Usuario();
        usuario.nickname = nombre;
        usuario.password = contraseña;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                break;
            }
        }
    }

    public boolean verificar(String nombre, String pass){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i].nickname.equals(nombre) && usuarios[i].password.equals(pass)){
                return true;
            }
        }

        return false;
    }
}
