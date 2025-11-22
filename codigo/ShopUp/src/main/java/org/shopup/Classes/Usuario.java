package org.shopup.Classes;

public class Usuario {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public boolean emailValido() {
        return email.endsWith("@gmail.com") || email.endsWith("@hotmail.com");
    }

    public String getEmail() {
        return email;
    }
}
