package com.fulboapp.service;

import java.util.List;
import com.fulboapp.dto.UserDTO;

public interface IUserService {

  List<UserDTO> getListAllUser();

  UserDTO addUser(UserDTO userDTO);

  UserDTO deleteUser(UserDTO userDTO);

  UserDTO updateUser(UserDTO userDTO);

  UserDTO findUserByCi(Long ci);

}
