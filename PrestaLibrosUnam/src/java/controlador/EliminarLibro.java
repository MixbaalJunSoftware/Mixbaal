package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import modelo.Libro;
import modelo.LibroDAO;

@ManagedBean
@RequestScoped

public class EliminarLibro {

    public Libro libro;

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    public void listener(ActionEvent event){
	libro = (Libro)event.getComponent().getAttributes().get("libro1");
        
    }

    public String EliminarLibro() {
        LibroDAO ld = new LibroDAO();
        ld.delete(libro);
        return "perfilIH?faces-redirect=true";
    }

}