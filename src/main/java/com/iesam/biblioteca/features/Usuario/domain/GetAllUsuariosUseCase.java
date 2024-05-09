package com.iesam.biblioteca.features.Usuario.domain;

import java.util.ArrayList;

public class GetAllUsuariosUseCase {

    private UsuarioRepository usuarioRepository;

    public GetAllUsuariosUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public ArrayList<Usuario> execute(){

        return this.usuarioRepository.obtainUsuarios();
    }
}
