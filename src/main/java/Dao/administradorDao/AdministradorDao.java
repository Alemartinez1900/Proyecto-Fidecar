/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao.administradorDao;

import Entidades.domain.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AMD
 */
public interface AdministradorDao extends JpaRepository<Administrador, Long>{
    
}
