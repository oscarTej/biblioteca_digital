package com.iesam.biblioteca.features.Usuario.data;

import com.iesam.biblioteca.features.Usuario.data.local.UserFileDataSource;
import com.iesam.biblioteca.features.Usuario.domain.Usuario;
import com.iesam.biblioteca.features.Usuario.domain.UsuarioRepository;


import java.util.ArrayList;

public  class UsuarioDataRepository implements UsuarioRepository {



    private final UserFileDataSource userFileDataSource;

    public UsuarioDataRepository(UserFileDataSource userFileDataSource){
        this.userFileDataSource = userFileDataSource;
        }


    public void delete (String dni){
        userFileDataSource.delete(dni);
    }

    @Override
    public Usuario obtainUsuario(String dni) {
      return userFileDataSource.findById(dni);
    }

    @Override
    public void save(Usuario usuario) {

        userFileDataSource.save(usuario);
    }

    @Override
    public ArrayList<Usuario> obtainUsuarios() {
    userFileDataSource.findAll();
    return  new ArrayList<>();

    }
}
