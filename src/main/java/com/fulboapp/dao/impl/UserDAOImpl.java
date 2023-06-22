package com.fulboapp.dao.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.fulboapp.dao.IUserDAO;
import com.fulboapp.dto.UserDTO;
import com.fulboapp.model.User;

@Repository
public class UserDAOImpl implements IUserDAO {

  @Override
  public UserDTO findUser(Long userID) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  /**
   * ACA SIMULAMOS COMO SI VAMOS A LA BASE DE DATOS Y BUSCAMOS EL LISTADO COMPLETO DE USUARIOS.
   */
  @Override
  public List<UserDTO> findAll() {
    return Arrays.asList(new UserDTO(), new UserDTO(), new UserDTO(), new UserDTO(), new UserDTO());
  }

  @Override
  public UserDTO addUser(UserDTO userDTO) {
    /**
     * En los DAO se pasa de DTOs a Entities para guardarlas en base de datos o de Entities a DTOs
     * para recibirlos.
     */
    User user = new User();
    user.setName(userDTO.getName());
    user.setLastName(userDTO.getLastName());
    user.setLocation(userDTO.getLocation());
    user.setNickName(userDTO.getName());
    user.setPhoneNumber(userDTO.getPhoneNumber());
    user.setEmail(userDTO.getEmail());
    // ACA SE LLAMA A LA BD Y SE GUARDA EL OBJETO USER
    return userDTO;
  }

  @Override
  public void deleteUser(UserDTO user) {
    // ACA SE LLAMA A LA BD Y SE BORRA EL OBJETO USER
  }

  @Override
  public void updateUser(UserDTO user) {

  }

}
