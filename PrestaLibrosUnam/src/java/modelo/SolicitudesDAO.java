package modelo;

import java.util.List;

public class SolicitudesDAO extends AbstractDAO {

    public SolicitudesDAO() {
        super();
    }

    /**
     * Insert a new Solicitud into the database.
     *
     * @param solicitud
     */
    public void save(Solicitudes solicitud) throws DataAccessLayerException {
        super.save(solicitud);
    }

    /**
     * Updates a new Solicitud into the database.
     *
     * @param solicitud
     */
    public void update(Solicitudes solicitud) throws DataAccessLayerException {
        super.update(solicitud);
    }

    /**
     * Delete a detached Solicitud from the database.
     *
     * @param solicitud
     */
    public void delete(Solicitudes solicitud) throws DataAccessLayerException {
        super.delete(solicitud);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Solicitudes find(Long id) throws DataAccessLayerException {
        return (Solicitudes) super.find(Solicitudes.class, id);
    }

    /**
     * Lista todos los solicituds de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Solicitudes.class);
    }
    
    /**
     * Lista todos los solicituds de la base de datos
     *
     * @return
     */
    public int maxIndice() {
        return super.maxIndice("solicitudes","idsolicitudes");
    }
}
