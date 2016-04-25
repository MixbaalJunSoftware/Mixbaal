package controlador;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import modelo.Libro;
import modelo.LibroDAO;
import modelo.Solicitudes;
import modelo.SolicitudesDAO;
import modelo.UsuarioDAO;
import modelo.Usuario;

@ManagedBean
@RequestScoped

public class SolicitarPrestamo {

    private Libro libro;
    private Usuario usuario;
  
  
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
  
    public void listener(ActionEvent event){
	libro = (Libro)event.getComponent().getAttributes().get("libro");
        usuario = (Usuario)event.getComponent().getAttributes().get("usuario");
    }
  

    public String SolicitarPrestamo() {
        SolicitudesDAO sd = new SolicitudesDAO();
        LibroDAO ld = new LibroDAO();
        UsuarioDAO ud = new UsuarioDAO();
        Solicitudes solicitud = new Solicitudes();
        Date date = new Date();
        solicitud.setIdsolicitudes(sd.maxIndice());
        solicitud.setUsuario(usuario);
        solicitud.setLibro(libro);
        solicitud.setAceptado(false);
        solicitud.setFecha(date);
        libro.getSolicitudeses().add(solicitud);
        usuario.getSolicitudeses().add(solicitud);
        sd.save(solicitud);
        return "PrincipalIH?faces-redirect=true";
    }

}