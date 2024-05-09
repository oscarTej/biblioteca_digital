package com.iesam.biblioteca.features.Usuario.domain;

public class GetUsuarioUseCase {

    private UsuarioRepository usuarioRepository;

    public GetUsuarioUseCase (UsuarioRepository usuarioRepository) {

        this.usuarioRepository = usuarioRepository;
    }

    public Usuario execute ( String dni){

        return usuarioRepository.obtainUsuario(dni);

    }
}

