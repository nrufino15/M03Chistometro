package com.company.Manager;

import com.company.Model.Usuario;

public class ManagerUsuarios {
    Usuario[] usuarios = new Usuario[10];

    public void crearUsuario(String firstName, String lastName, String username, String password) {
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

    public boolean verificar(String username, String password){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null && usuarios[i].nickname.equals(username) && usuarios[i].password.equals(password)){
                return true;
            }
        }
        return false;
    }

    public boolean verificarPassword(String password){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null && usuarios[i].password.equals(password)){
                return true;
            }
        }
        return false;
    }

    public void consultar(){
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null){
                System.out.println(usuarios[i]);
            }
        }
    }
}
