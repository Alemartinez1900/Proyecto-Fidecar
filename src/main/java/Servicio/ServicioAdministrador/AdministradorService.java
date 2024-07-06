/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio.ServicioAdministrador;

import Entidades.domain.Administrador;
import java.util.List;

/**
 *
 * @author AMD
 */
public interface AdministradorService {
    public List <Administrador> getAdministrador (boolean activos);
    
    public Administrador getAdministrador (Administrador administrador);
    
    public void save (Administrador administrador);
    
    public void delete (Administrador administrador);
}
