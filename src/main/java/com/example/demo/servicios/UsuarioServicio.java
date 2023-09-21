/*

public class UsuarioServicio implements UserDetailsService{
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

@Transactional
    public void registrar(MultipartFile archivo, String nombre, String email, String password, String password2) throws MiException {

        validar(nombre, email, password, password2);

        Usuario usuario = new Usuario();

        
        usuario.setEmail(email);

        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        
        usuario.setRol(Rol.USER);
        
        Imagen imagen = imagenServicio.guardar(archivo);
        
        usuario.setImagen(imagen);
        
        usuarioRepositorio.save(usuario);
    }

public Usuario getOne(String id){
        return usuarioRepositorio.getOne(id);
    }

@Transactional(readOnly=true)
    public List<Usuario> listarUsuarios() {

        List<Usuario> usuarios = new ArrayList();

        usuarios = usuarioRepositorio.findAll();

        return usuarios;
    }

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
    public void registrar(String nombre){
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuarioRepositorio.save(usuario);
    }
    
    @Transactional
    public List<Usuario> listarUsuarios() {

        List<Usuario> usuarios = new ArrayList();

        usuarios = usuarioRepositorio.findAll();

        return usuarios;
    }
    
}
