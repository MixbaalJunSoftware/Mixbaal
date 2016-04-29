package controlador;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import modelo.Solicitudes;
import modelo.SolicitudesDAO;
import modelo.Usuario;

@ManagedBean
@ViewScoped

public class AceptarSolicitud implements Serializable{
    private  FacesContext context = FacesContext.getCurrentInstance();
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
    
    public String aceptarSolicitud() {
        SolicitudesDAO sd = new SolicitudesDAO();
        List<Solicitudes> solicitudes = sd.pendientesLibro(solicitud.getLibro().getIdlibro());
        for(Solicitudes s : solicitudes){
            if(s.getIdsolicitudes() != solicitud.getIdsolicitudes()){
                s.getUsuario().getSolicitudeses().remove(s);
                s.getLibro().getSolicitudeses().remove(s);
                sd.delete(s);
            }
        }
        solicitud.setAceptado(true);
        sd.update(solicitud);
        return "perfilIH?faces-redirect=true";
    }

}