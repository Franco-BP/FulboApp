package com.fulboapp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fulboapp.dao.IUserDAO;
import com.fulboapp.dto.UserDTO;
import com.fulboapp.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

  @Autowired
  IUserDAO iUserDAO;

  @Override
  public List<UserDTO> getListAllUser() {
    return iUserDAO.findAll();
  }

  public UserDTO addUser(UserDTO userDTO) {
    return iUserDAO.addUser(userDTO);
  }

  @Override
  public UserDTO deleteUser(UserDTO userDTO) {
    return iUserDAO.deleteUser(userDTO);
  }

  @Override
  public UserDTO updateUser(UserDTO userDTO) {
    return iUserDAO.updateUser(userDTO);
  }

  @Override
  public UserDTO findUserByCi(Long ci) {
    return iUserDAO.findUserByCi(ci);
  }



}
