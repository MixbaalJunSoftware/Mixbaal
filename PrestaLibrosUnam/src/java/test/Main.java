/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

//import controlador.Registrar;
//import controlador.EditarUsuario;
import modelo.Usuario;
import controlador.EliminarUsuario;


/**
 *
 * @author jonathanjb
 */
public class Main {
    public static  void main(String args[]){
      /** Prueba para registrar un usuario, hasta el momento solo falla cuando la tabla es vacia*/ 
      /**
        Registrar u =new Registrar();
        u.setNombe("jonathan");
        u.setApp("Barragan");
        u.setApm("Jimenez");
        u.setPassword("cosow");
        u.setCorreo("ja@gmail.com");
        u.setFacultad("ciencias");
        u.setTelefono("1244");
        u.registraU();
      */
      /**Prueba para eliminar usuario, lo probe y no fallo*/
      EliminarUsuario elim = new EliminarUsuario();
      Usuario u = new Usuario();
        u.setIdusuario(3);
        u.setNombre("jonathan");
        u.setApp("Barragan");
        u.setApm("Jimenez");
        u.setContrasenia("cosow");
        u.setCorreo("ja@gmail.com");
        u.setFacultad("ciencias");
        u.setTelefono("1244");
        //edit.setTelefono("123456789");
        elim.setUsuario(u);
        elim.eliminar();
        
        /**Prueba para editar usuario, lo probe, no fallo */
        /**
        EditarUsuario edit = new EditarUsuario();
       Usuario u = new Usuario();
        u.setIdusuario(3);
        u.setNombre("jonathan");
        u.setApp("Barragan");
        u.setApm("Jimenez");
        u.setContrasenia("cosow");
        u.setCorreo("ja@gmail.com");
        u.setFacultad("ciencias");
        u.setTelefono("1244");
        edit.setUsuario(u);
        edit.setTelefono("123456789");
        edit.editar();
        */
       
    }
}
