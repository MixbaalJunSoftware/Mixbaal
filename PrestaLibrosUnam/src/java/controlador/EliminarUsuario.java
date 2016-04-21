package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class EliminarUsuario {

  public Usuario usario;
  private String msn;
  
   public String getMsn() {
        return msn;
    }      

    public void setMsn(String msn) {
        this.msn = msn;
    }

  public String eliminar() {
      UsuarioDAO usr = new UsuarioDAO();
      try{
          usr.delete(usario);
          return "PrincipalIH";
      }catch(Exception e){
          this.setMsn("¡UPS! Ocurrio un error, vuelve a intentarlo");
          return "EditarCuentaIH";
      }
  }

}
