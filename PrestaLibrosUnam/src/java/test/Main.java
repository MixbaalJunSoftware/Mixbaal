/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

//import controlador.Registrar;
import controlador.EditarUsuario;
import modelo.Usuario;


/**
 *
 * @author jonathanjb
 */
public class Main {
    public static  void main(String args[]){
      /**  
        Registrar u =new Registrar();
        u.setNombe("jonathan");
        u.setApp("Barragan");
        u.setApm("Jimenez");
        u.setPassword("cosow");
        u.setCorreo("joba@gmail.com");
        u.setFacultad("ciencias");
        u.setTelefono("1244");
        u.registraU();
      */
      EditarUsuario edit = new EditarUsuario();
      Usuario u = new Usuario();
        u.setNombre("jonathan");
        u.setApp("Barragan");
        u.setApm("Jimenez");
        u.setContrasenia("cosow");
        u.setCorreo("joba@gmail.com");
        u.setFacultad("ciencias");
        u.setTelefono("1244");
        edit.setUsuario(u);
        
    }
}
