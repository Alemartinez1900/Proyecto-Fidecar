/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImpl.AdministradorServiceImpl;

import Dao.administradorDao.AdministradorDao;
import Entidades.domain.Administrador;
import Servicio.ServicioAdministrador.AdministradorService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImpl implements AdministradorService {

    @Autowired
    private AdministradorDao administradorDao;

    @Override
    @Transactional(readOnly = true)

    public List<Administrador> getAdministrador(boolean activos) {
        var lista = administradorDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivos());

        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Administrador getAdministrador(Administrador administrador) {
        return administradorDao.findById(administrador.getIdAdministrador()).orElse(null);

    }

    @Override
    @Transactional
    public void save(Administrador administrador) {
        administradorDao.save(administrador);
    }

    @Override
    @Transactional
    public void delete(Administrador administrador) {
        administradorDao.delete(administrador);
    }

}
