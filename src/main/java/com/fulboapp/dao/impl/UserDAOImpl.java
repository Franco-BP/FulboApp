package com.fulboapp.dao.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.fulboapp.dao.IUserDAO;
import com.fulboapp.dto.UserDTO;
import com.fulboapp.model.User;
import com.fulboapp.repo.IUserRepo;
import com.fulboapp.util.DozerUtil;

@Repository
public class UserDAOImpl implements IUserDAO {

  @Autowired
  private IUserRepo repo;

  @Override
  public UserDTO findUser(Integer userID) {
    return new UserDTO();
  }

  @Override
  public List<UserDTO> findAll() {
    return repo.findAll().stream()
        .map(p -> DozerUtil.getINSTANCE().getMapper().map(p, UserDTO.class))
        .collect(Collectors.toList());
  }

  /**
   * En los DAO se pasa de DTOs a Entities para guardarlas en base de datos o de Entities a DTOs
   * para recibirlos.
   */
  @Override
  public UserDTO addUser(UserDTO userDTO) {
    User user = repo.save(DozerUtil.getINSTANCE().getMapper().map(userDTO, User.class));
    return DozerUtil.getINSTANCE().getMapper().map(user, UserDTO.class);
  }

  @Override
  public void deleteUser(UserDTO userDTO) {
    repo.delete(DozerUtil.getINSTANCE().getMapper().map(userDTO, User.class));
  }

  @Override
  public UserDTO updateUser(UserDTO userDTO) {
    User user = repo.save(DozerUtil.getINSTANCE().getMapper().map(userDTO, User.class));
    return DozerUtil.getINSTANCE().getMapper().map(user, UserDTO.class);
  }

  @Override
  public UserDTO findByCi(Long userCi) {
    return DozerUtil.getINSTANCE().getMapper().map(repo.findByCi(userCi), UserDTO.class);
  }



}
