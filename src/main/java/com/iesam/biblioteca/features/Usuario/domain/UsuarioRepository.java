package com.iesam.biblioteca.features.Usuario.domain;

import java.util.ArrayList;

public interface UsuarioRepository {
     void delete(String id);

    Usuario obtainUsuario(String dni);

    void save (Usuario usuario);

    ArrayList<Usuario> obtainUsuarios();
}
