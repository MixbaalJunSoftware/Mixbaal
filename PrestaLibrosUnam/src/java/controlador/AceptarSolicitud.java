package controlador;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import modelo.Solicitudes;
import modelo.SolicitudesDAO;
import modelo.Usuario;

@ManagedBean
@ViewScoped

public class AceptarSolicitud {
    private Solicitudes solicitud;
    private Usuario usuario;
    private List<Solicitudes> lsolicitud;
    
    public List<Solicitudes> getLsolicitud() {
        return lsolicitud;
    }

    public void setLsolicitud(List<Solicitudes> lsolicitud) {
        this.lsolicitud = lsolicitud;
    }

    public Solicitudes getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitudes solicitud) {
        this.solicitud = solicitud;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void listener(ActionEvent event){
	solicitud= (Solicitudes)event.getComponent().getAttributes().get("solicitud");
        usuario = (Usuario)event.getComponent().getAttributes().get("usuario");
    }
    @PostConstruct
    public void verSolicitudes(){
        SolicitudesDAO s = new SolicitudesDAO();
        lsolicitud = s.findAll();
    }
    
    public void AceptarSolicitud() {
        usuario.getSolicitudeses().remove(this.solicitud);
        solicitud.setAceptado(true);
        usuario.getSolicitudeses().add(this.solicitud);
      
    }

}