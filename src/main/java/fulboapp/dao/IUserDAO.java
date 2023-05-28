package fulboapp.dao;

import java.util.List;
import fulboapp.dto.UserDTO;

public interface IUserDAO {

	/**
	 * Busca un usuario con el ID ingresado.
	 *
	 * @param userID ID del usuario.
	 * @return objeto IUserDAO o null si no hay coincidencias.
	 */
	public UserDTO findUser(Long userId);

	/**
	 * Busca todos los usuarios de la base de datos.
	 * 
	 * @return ArrayList<IUserDTO> con los usuarios.
	 */
	public List<UserDTO> findAll();

	/**
	 * Agrega un nuevo usuario a la base de datos.
	 *
	 * @param user Objeto a agregar.
	 */
	public void addUser(UserDTO user);

	/**
	 * Elimina un usuario existente de la base de datos.
	 *
	 * @param user Objeto a actualizar.
	 */
	public void removeUser(UserDTO user);

	/**
	 * Actualiza un usuario en la base de datos.
	 *
	 * @param user Objeto a eliminar.
	 */
	public void updateUser(UserDTO user);

}
