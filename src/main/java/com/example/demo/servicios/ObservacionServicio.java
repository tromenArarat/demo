/*

 */

package com.example.demo.servicios;

import com.example.demo.entidades.Observacion;
import com.example.demo.repositorio.ObservacionRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObservacionServicio {

    @Autowired
    ObservacionRepositorio observacionRepositorio;

    @Transactional
    public void crearObservacion(String nombre) throws Exception{
        Observacion observacion = new Observacion();
        observacion.setNombre(nombre);

        observacionRepositorio.save(observacion);
        
    }

    public List<Observacion> listarObservaciones() {

        List<Observacion> observaciones = new ArrayList();

        observaciones = observacionRepositorio.findAll();

        return observaciones;
    }
    
}
