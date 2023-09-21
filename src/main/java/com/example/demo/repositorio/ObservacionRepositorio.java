/*

 */
package com.example.demo.repositorio;

import com.example.demo.entidades.Observacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObservacionRepositorio extends JpaRepository<Observacion,String> {
    
}
