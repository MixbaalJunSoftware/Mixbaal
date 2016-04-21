package controlador;

import modelo.Libro;
import modelo.LibroDAO;
import modelo.Solicitudes;
import modelo.SolicitudesDAO;
import modelo.UsuarioDAO;
import modelo.Usuario;

public class SolicitarPrestamo {

  private Libro libro;
  private Usuario usuario;
  

  public void SolicitarPrestamo() {
      SolicitudesDAO sd = new SolicitudesDAO();
      LibroDAO ld = new LibroDAO();
      UsuarioDAO ud = new UsuarioDAO();
      Solicitudes solicitud = new Solicitudes();
      solicitud.setUsuario(usuario);
      solicitud.setLibro(libro);
      solicitud.setAceptado(false);
      libro.getSolicitudeses().add(solicitud);
      usuario.getSolicitudeses().add(solicitud);
      sd.save(solicitud);
      ud.update(usuario);
      ld.update(libro);
  }

}