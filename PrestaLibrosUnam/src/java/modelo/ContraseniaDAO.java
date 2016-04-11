package modelo;

import java.util.List;

public class ContraseniaDAO extends AbstractDAO {
    
    public ContraseniaDAO() {
        super();
    }

    /**
     * Insert a new Contrasenia into the database.
     *
     * @param usuario
     */
    public void save(Contrasenia usuario) throws DataAccessLayerException {
        super.save(usuario);
    }

    /**
     * Updates a new Contrasenia into the database.
     *
     * @param usuario
     */
    public void update(Contrasenia usuario) throws DataAccessLayerException {
        super.update(usuario);
    }

    /**
     * Delete a detached Contrasenia from the database.
     *
     * @param usuario
     */
    public void delete(Contrasenia usuario) throws DataAccessLayerException {
        super.delete(usuario);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Contrasenia find(Long id) throws DataAccessLayerException {
        return (Contrasenia) super.find(Contrasenia.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Contrasenia.class);
    }
    
}