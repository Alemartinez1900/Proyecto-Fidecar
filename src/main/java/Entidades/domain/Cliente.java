/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name = "cliente") 
public class Cliente implements Serializable{
    
        private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "Id_Cliente" )
    private long idCliente;
    private String nombre;
    private String contrasena;
    private String correoElectronico;
    private String fechaRegistro;
    private String direccion;
    private boolean activos;
    public Cliente() {
    }

    public Cliente(String nombre, String contrasena, String correoElectronico, String fechaRegistro, String direccion, boolean activos) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correoElectronico = correoElectronico;
        this.fechaRegistro = fechaRegistro;
        this.direccion = direccion;
        this.activos = activos;
    }
    
}
