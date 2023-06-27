package com.fulboapp.service;

import java.util.List;
import com.fulboapp.dto.UserDTO;

public interface IUserService {

  List<UserDTO> getListAllUser();

  void addUser(UserDTO userDTO);

  void deleteUser(UserDTO userDTO);

  void updateUser(UserDTO userDTO);

  UserDTO findUserByCi(Long ci);

}
