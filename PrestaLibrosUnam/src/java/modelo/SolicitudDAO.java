package modelo;

import java.util.List;

public class SolicitudDAO extends AbstractDAO {

    public SolicitudDAO() {
        super();
    }

    /**
     * Insert a new Solicitud into the database.
     *
     * @param solicitud
     */
    public void save(Solicitud solicitud) throws DataAccessLayerException {
        super.save(solicitud);
    }

    /**
     * Updates a new Solicitud into the database.
     *
     * @param solicitud
     */
    public void update(Solicitud solicitud) throws DataAccessLayerException {
        super.update(solicitud);
    }

    /**
     * Delete a detached Solicitud from the database.
     *
     * @param solicitud
     */
    public void delete(Solicitud solicitud) throws DataAccessLayerException {
        super.delete(solicitud);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Solicitud find(Long id) throws DataAccessLayerException {
        return (Solicitud) super.find(Solicitud.class, id);
    }

    /**
     * Lista todos los solicituds de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Solicitud.class);
    }
}