package controlador;

import modelo.Libro;
import modelo.LibroDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import modelo.Usuario;

@ManagedBean
@RequestScoped

public class CrearLibro {
    
    private String nombre;
    private String editorial;
    private String autor;
    private String descripcion;
    private String genero;
    private String pais;
    private String foto;
    private int idLibro;
    private String msn ;
    private Usuario usuario;

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }
    
    public void listener(ActionEvent event){
	usuario = (Usuario)event.getComponent().getAttributes().get("usuario");
    }
    
   
  
    public String crearLibro() {
        LibroDAO ld = new LibroDAO();
        Libro libro = new Libro();
        libro.setIdlibro(ld.maxIndice());
        libro.setNombre(this.getNombre());
        libro.setEditorial(this.getEditorial());
        libro.setAutor(this.getAutor());
        libro.setDescripcion(this.getDescripcion());
        libro.setGenero(this.getGenero());
        libro.setPais(this.getPais());
        libro.setFotoLibro(this.getFoto());
        libro.setUsuario(usuario);
        this.setMsn("Libro Creado Correctamente");
        ld.save(libro);
        return "CrearLibroIH?faces-redirect=true";
    }
    
    

}