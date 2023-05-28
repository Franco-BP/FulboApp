package fulboapp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fulboapp.dao.IUserDAO;
import fulboapp.dto.UserDTO;
import fulboapp.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserDAO iUserDAO;

	@Override
	public List<UserDTO> getListAllUser() {
		return iUserDAO.findAll();
	}

}
