package controlador;

import javax.faces.bean.ManagedBean;
import modelo.Libro;
import modelo.LibroDAO;

@ManagedBean

public class EliminarLibro {

    public Libro libro;

    public void EliminarLibro() {
        LibroDAO ld = new LibroDAO();
        ld.delete(libro);
    }

}