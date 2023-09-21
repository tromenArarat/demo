/*

 */

package com.example.demo;

import com.example.demo.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @Autowired
        private UsuarioServicio usuarioServicio;
    
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
            
         
        } catch (Exception ex) {

            return "registro.html";
        }
        return "index.html";
    }
    
    @GetMapping("/usuarios")
    public String usuarios(){
        return "usuario_lista.html";
    }
}
