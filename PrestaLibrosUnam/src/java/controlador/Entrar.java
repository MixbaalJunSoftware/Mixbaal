package controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Usuario;
import modelo.UsuarioDAO;

@ManagedBean
@SessionScoped

public class Entrar implements Serializable{
    
    private String correo;
    private String contrasenia;
    private String msn;
    private Usuario usuario;
    
    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public boolean hayUsuario(){
        return this.getUsuario()!=null;
    }
    
    public String salir(){
        this.setUsuario(null);
        return "PrincipalIH?faces-redirect=true";
    }
    
    public String entrar(){
        UsuarioDAO ud = new UsuarioDAO();
        Usuario u = ud.valida(this.getCorreo(),this.getContrasenia());
        if(u!=null){
            this.setUsuario(u);
            this.setMsn("");
            this.setCorreo("");
            this.setContrasenia("");
            return "perfilIH?faces-redirect=true";
        }
        this.setMsn("Error! Contraseña o correo incorrectos");
        return "EntrarIH?faces-redirect=true";
    }

}