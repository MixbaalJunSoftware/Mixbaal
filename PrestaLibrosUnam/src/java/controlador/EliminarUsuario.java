package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@SessionScoped

public class EliminarUsuario {

  public Usuario usuario;
  private String msn;
  
   public String getMsn() {
        return msn;
    }      

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
     public void listener(ActionEvent event){
	usuario = (Usuario)event.getComponent().getAttributes().get("usuario");
    }

  public String eliminar() {
      UsuarioDAO usr = new UsuarioDAO();
      try{
          usr.delete(usuario);
          System.out.print("Se elimino correctamente");
          return "PrincipalIH";
      }catch(Exception e){
          this.setMsn("¡UPS! Ocurrio un error, vuelve a intentarlo");
          System.out.print("Ocurrio un error");
          return "EditarCuentaIH";
      }
  }

}
