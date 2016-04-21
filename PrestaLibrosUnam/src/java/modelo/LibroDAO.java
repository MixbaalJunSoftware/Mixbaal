package modelo;

import java.util.List;


public class LibroDAO extends AbstractDAO {
    
    public LibroDAO() {
        super();
    }

    /**
     * Insert a new Libro into the database.
     *
     * @param libro
     */
    public void save(Libro libro) throws DataAccessLayerException {
        super.save(libro);
    }

    /**
     * Updates a new Libro into the database.
     *
     * @param libro
     */
    public void update(Libro libro) throws DataAccessLayerException {
        super.update(libro);
    }

    /**
     * Delete a detached Libro from the database.
     *
     * @param libro
     */
    public void delete(Libro libro) throws DataAccessLayerException {
        super.delete(libro);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Libro find(Long id) throws DataAccessLayerException {
        return (Libro) super.find(Libro.class, id);
    }

    /**
     * Lista todos los libros de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Libro.class);
    }
    
    public int maxIndice(){
        return super.maxIndice("libro", "idlibro");
    }
}