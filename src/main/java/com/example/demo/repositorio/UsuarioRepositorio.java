/*

 */
package com.example.demo.repositorio;

import com.example.demo.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,String>{
}
