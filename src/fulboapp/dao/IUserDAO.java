package fulboapp.dao;

import java.util.ArrayList;

/**
 *
 * @author Franco Bascialla
 */
public interface IUserDAO {

    /**
     * Busca un usuario con el ID ingresado.
     *
     * @param userID ID del usuario.
     * @return objeto IUserDAO o null si no hay coincidencias.
     */
    public IUserDAO findUser(String userID);
    
    /**
     * Busca todos los usuarios de la base de datos.
     * @return ArrayList<IUserDAO> con los usuarios.
     */
    public ArrayList<IUserDAO> findAll();

    /**
     * Agrega un nuevo usuario a la base de datos.
     *
     * @param user Objeto a agregar.
     */
    public void addUser(IUserDAO user);

    /**
     * Elimina un usuario existente de la base de datos.
     *
     * @param user Objeto a actualizar.
     */
    public void removeUser(IUserDAO user);

    /**
     * Actualiza un usuario en la base de datos.
     *
     * @param user Objeto a eliminar.
     */
    public void updateUser(IUserDAO user);

}
