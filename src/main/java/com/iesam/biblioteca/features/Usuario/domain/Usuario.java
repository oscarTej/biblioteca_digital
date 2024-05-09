package com.iesam.biblioteca.features.Usuario.domain;

public class Usuario {
    public String dni;
    public String nombre;

    public String numeroTelefono;

    public Usuario(String dni, String nombre, String numTelefono) {
        this.dni = this.dni;
        this.nombre = this.nombre;
        this.numeroTelefono = numeroTelefono;
    }



    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getId() {
        return dni;
    }

    public void setId(String id) {
        this.dni = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
