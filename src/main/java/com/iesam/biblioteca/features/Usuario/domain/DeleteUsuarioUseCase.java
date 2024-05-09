package com.iesam.biblioteca.features.Usuario.domain;

public class DeleteUsuarioUseCase {

    private UsuarioRepository usuarioRepository;

    public DeleteUsuarioUseCase(UsuarioRepository usuarioRepository) {

        this.usuarioRepository = usuarioRepository;
    }

    public void execute (String dni){

        usuarioRepository.delete(dni);
    }
}
