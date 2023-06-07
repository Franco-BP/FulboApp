package fulboapp.dao.impl;

import java.util.Arrays;
import java.util.List;

import fulboapp.dao.IUserDAO;
import fulboapp.dto.UserDTO;
import fulboapp.model.User;

public class UserDAOImpl implements IUserDAO {

	@Override
	public UserDTO findUser(Long userID) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * ACA SIMULAMOS COMO SI VAMOS A LA BASE DE DATOS Y BUSCAMOS EL LISTADO COMPLETO
	 * DE USUARIOS.
	 */
	@Override
	public List<UserDTO> findAll() {
		return Arrays.asList(new UserDTO(), new UserDTO(), new UserDTO(), new UserDTO(), new UserDTO());
	}

	@Override
	public void addUser(UserDTO userDTO) {
		throw new UnsupportedOperationException("Not supported yet.");
		/**
		 * En los DAO se pasa de DTOs a Entities para guardarlas en base de datos o de Entities a DTOs para recibirlos.
		 */
//	User user = new User();
//	user.setEmail(userDTO.getEmail());
//	getBaseDeDatos
	}

	@Override
	public void deleteUser(UserDTO user) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void updateUser(UserDTO user) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
