package modelo;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UsuarioDAO extends AbstractDAO {

    public UsuarioDAO() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     *
     * @param usuario
     */
    public void save(Usuario usuario) throws DataAccessLayerException {
        super.save(usuario);
    }

    /**
     * Updates a new Usuario into the database.
     *
     * @param usuario
     */
    public void update(Usuario usuario) throws DataAccessLayerException {
        super.update(usuario);
    }

    /**
     * Delete a detached Usuario from the database.
     *
     * @param usuario
     */
    public void delete(Usuario usuario) throws DataAccessLayerException {
        super.delete(usuario);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Usuario find(Long id) throws DataAccessLayerException {
        return (Usuario) super.find(Usuario.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Usuario.class);
    }
    
    public Usuario valida(String correo,String contrasenia){
        SessionFactory factory; 
        try{
            factory = new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
        }    
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String sql = "SELECT * FROM usuario where correo ='" + correo + "' and contrasenia = '" + contrasenia+"'";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(Usuario.class);
            List<Usuario> userList = query.list();
            tx.commit();
            if (userList!= null && !userList.isEmpty()) {
                return userList.get(0);
            }else{
                return null;
            }
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            return null; 
        }finally {
            session.close(); 
        }  
    }
    
    /**
     * Metedo que obtinen el maximo indice de la tabla usuario.
     * @return max, el Maximo indice de la tabla usuario. 
     */
    public int maxIndice(){
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
        //System.out.println(max+1);
        try {
            tx = session.beginTransaction();
            String sql = "SELECT max(idusuario) FROM usuario";
            SQLQuery query = session.createSQLQuery(sql);
            //System.out.println("hola"+sql);
            if(query != null){
                max = (int)query.uniqueResult();
            }
            //System.out.println(max);
            tx.commit();
            //return max;
        }catch(HibernateException e){
            System.out.println("coso"+e);
            
        }finally{
            session.close();
        }
      //System.out.println(max+1);
      return max+1;
  }
    
}