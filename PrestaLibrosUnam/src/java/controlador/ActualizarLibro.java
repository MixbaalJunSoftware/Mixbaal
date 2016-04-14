package controlador;

import modelo.Libro;
import modelo.LibroDAO;

public class ActualizarLibro {

 private Libro libro;
    private String descripcion;
    private String foto;

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void actualizarLibro() {
        LibroDAO ld = new LibroDAO();
        libro.setDescripcion(this.getDescripcion());
        libro.setFotoLibro(this.getFoto());
        ld.update(libro);
    }
    
}