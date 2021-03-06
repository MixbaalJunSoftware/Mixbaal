package modelo;
// Generated 14/04/2016 02:28:52 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Solicitudes generated by hbm2java
 */
public class Solicitudes  implements java.io.Serializable {


     private int idsolicitudes;
     private Libro libro;
     private Usuario usuario;
     private Date fecha;
     private Boolean aceptado;

    public Solicitudes() {
    }

	
    public Solicitudes(int idsolicitudes) {
        this.idsolicitudes = idsolicitudes;
    }
    public Solicitudes(int idsolicitudes, Libro libro, Usuario usuario, Date fecha, Boolean aceptado) {
       this.idsolicitudes = idsolicitudes;
       this.libro = libro;
       this.usuario = usuario;
       this.fecha = fecha;
       this.aceptado = aceptado;
    }
   
    public int getIdsolicitudes() {
        return this.idsolicitudes;
    }
    
    public void setIdsolicitudes(int idsolicitudes) {
        this.idsolicitudes = idsolicitudes;
    }
    public Libro getLibro() {
        return this.libro;
    }
    
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Boolean getAceptado() {
        return this.aceptado;
    }
    
    public void setAceptado(Boolean aceptado) {
        this.aceptado = aceptado;
    }




}


