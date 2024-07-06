/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao.ClienteDao;

import Entidades.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AMD
 */
public interface ClienteDao extends JpaRepository<Cliente, Long>{
    
}
