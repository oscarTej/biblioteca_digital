package com.iesam.biblioteca.features.Usuario.domain;

public class SaveUsuarioUseCase {

public final UsuarioRepository usuarioRepository;


    public SaveUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public final void execute (Usuario usuario){


        usuarioRepository.save(usuario);
    }
}
