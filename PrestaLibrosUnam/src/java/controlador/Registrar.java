package controlador;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import modelo.Usuario;
import javax.faces.bean.ManagedBean;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@ManagedBean
/**
 *
 * @author jonathanjb
 */
public class Registrar {

    //public Usuario usuario;
  
    private String nombe;//Nombre de el usuario.
    private String app;//Apellido paterno del usuario.
    private String apm;//Apellido materno del usuario.
    private String password;//contrasenia del usuario.
    private Date fechaNacimiento;//fecha del usuario.
    private int telefono;//Teleffono del usuario.
    private String facultad;//Facultad del usuario. 

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
  public void Registrar() {
      
  }
  
  private int maxIndice(){
      SessionFactory factory;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        int max=-1;
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "SELECT max(idusuario) FROM usuarios";
            SQLQuery query = session.createSQLQuery(sql);
            max = (int)query.uniqueResult();
            tx.commit();
            //return max;
        }catch(HibernateException e){
            
        }finally{
            session.close();
        }
      return max;
  }
}