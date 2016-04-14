package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;

public class Entrar {
    
    private String correo;
    private String contrasenia;

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

    public void entrar(){
        UsuarioDAO ud = new UsuarioDAO();
        //Usuario usuario = ud.valida(this.getCorreo(),this.getContrasenia()).get(0);    
    }

}