/*

 */

package com.example.demo.servicios;

import com.example.demo.entidades.Usuario;
import com.example.demo.repositorio.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio{
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    
    @Transactional
    public void registrar(String nombre) throws Exception{
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuarioRepositorio.save(usuario);
    }
    
    public List<Usuario> listarUsuarios() {

        List<Usuario> usuarios = new ArrayList();

        usuarios = usuarioRepositorio.findAll();

        return usuarios;
    }
    
}
