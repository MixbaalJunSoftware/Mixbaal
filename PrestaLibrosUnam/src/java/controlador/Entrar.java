package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Usuario;
import modelo.UsuarioDAO;

@ManagedBean
@SessionScoped

public class Entrar {
    
    private String correo;
    private String contrasenia;
    private String msn;
    
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

    public String entrar(){
        UsuarioDAO ud = new UsuarioDAO();
        if(ud.valida(this.getCorreo(),this.getContrasenia()))
            return "PrincipalIH";
        else{
            this.setMsn("Error! Contraseña o correo incorrectos");
            return "EntrarIH";
        }
    }

}