/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.AdministradorController;

import Entidades.domain.Administrador;
import Servicio.ServicioAdministrador.AdministradorService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping("/administrador")
public class AdministradorController {

    @Autowired
    private AdministradorService administradorService;
    


    @GetMapping("/")
    public String home() {
        return "index";
    }


    @GetMapping("/lista")
    public String inicio(Model modelo) {
        var administradores = administradorService.getAdministrador(false);
        modelo.addAttribute("administradores", administradores);
        modelo.addAttribute("totalAdministradores", administradores.size());
        return "/administrador/lista";
    }

    @GetMapping("/nuevo")
    public String administradorNuevo(Administrador administrador) {
        return "/administrador/modifica";

    }

    @GetMapping("/eliminar/{idAdministrador}")
    public String eliminarAdministrador(Administrador administrador) {
        administradorService.delete(administrador);
        return "redirect:/administrador/lista";

    }
    
    @GetMapping ("/modificar/{idAdministrador}")
    public String modificarAdministrador (Administrador administrador, Model modelo){
        administrador = administradorService.getAdministrador(administrador);
        modelo.addAttribute("administrador", administrador);
        return "/administrador/modifica";
    
    }

}
