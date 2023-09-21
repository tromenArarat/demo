/*

 */

package com.example.demo;

import com.example.demo.entidades.Observacion;
import com.example.demo.entidades.Usuario;
import com.example.demo.servicios.ObservacionServicio;
import com.example.demo.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
    
        @Autowired
        private UsuarioServicio usuarioServicio;
        @Autowired
        private ObservacionServicio observacionServicio;
    
    @GetMapping("/")
    public String index(){
        
        return "index.html";
    }
    
    @GetMapping("/registrar")
    public String registrar(){
        return "registro.html";
    }
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre) {

        try {
           usuarioServicio.registrar(nombre);
         
        } catch (Exception e) {

            return "registro.html";
        }
        return "index.html";
    }
    
    @GetMapping("/usuarios")
    public String usuarios(ModelMap modelo){
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        modelo.addAttribute("usuarios", usuarios);
        return "usuario_lista.html";
    }
    
    
    @GetMapping("/registrare")
    public String registrare(){
        return "registroe.html";
    }
    @PostMapping("/registroe")
    public String registroe(@RequestParam String nombre) {

        try {
           observacionServicio.crearObservacion(nombre);
         
        } catch (Exception e) {

            return "registroe.html";
        }
        return "index.html";
    }
    
    @GetMapping("/observaciones")
    public String observaciones(ModelMap modelo){
        List<Observacion> observaciones = observacionServicio.listarObservaciones();
        modelo.addAttribute("observaciones", observaciones);
        return "observaciones.html";
    }
}
