package modelo;


public class Libro {

    public String nombre;

    public String editorial;

    public String autor;

    public String descripcion;

    public String genero;

    public String pais;

    public String foto;

    public int idLibro;
  
  
    public Libro(String nombre, String editorial, String autor, String descripcion, String genero, String pais, String foto, int idLibro) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
        this.descripcion = descripcion;
        this.genero = genero;
        this.pais = pais;
        this.foto = foto;
        this.idLibro = idLibro;
    }
  
  

}