/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controlador.Registrar;


/**
 *
 * @author jonathanjb
 */
public class Main {
    public static  void main(String args[]){
        Registrar u =new Registrar();
        u.setNombe("jonathan");
        u.setApp("Barragan");
        u.setApm("Jimenez");
        u.setPassword("cosow");
        u.setCorreo("joba@gmail.com");
        u.setFacultad("ciencias");
        u.setTelefono(1244);
        u.registraU();
    }
}
