package fulboapp.dao.impl;

import java.util.Arrays;
import java.util.List;
import fulboapp.dao.IUserDAO;
import fulboapp.dto.UserDTO;

public class UserDAOImpl implements IUserDAO {

	@Override
	public UserDTO findUser(String userID) {
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
	public void addUser(UserDTO user) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void removeUser(UserDTO user) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void updateUser(UserDTO user) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
