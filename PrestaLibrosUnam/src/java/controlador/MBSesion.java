/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Usuario;

/**
 *
 * @author luis
 */

@ManagedBean
@SessionScoped

public class MBSesion implements Serializable {
    
    private Usuario usuario;

    /**
     * Creates a new instance of MBSesion
     */
    public MBSesion() {
    }
    
}
