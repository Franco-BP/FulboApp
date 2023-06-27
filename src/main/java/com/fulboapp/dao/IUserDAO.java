package com.fulboapp.dao;

import java.util.List;
import com.fulboapp.dto.UserDTO;

public interface IUserDAO {

  /**
   * Agrega un nuevo usuario a la base de datos.
   *
   * @param user Objeto a agregar.
   */
  UserDTO addUser(UserDTO user);

  /**
   * Elimina un usuario existente de la base de datos.
   *
   * @param user Objeto a actualizar.
   * @return 
   */
  UserDTO deleteUser(UserDTO user);

  /**
   * Actualiza un usuario en la base de datos.
   *
   * @param user Objeto a eliminar.
   */
  UserDTO updateUser(UserDTO user);

  /**
   * Busca un usuario con el ID ingresado.
   *
   * @param userID ID del usuario.
   * @return objeto IUserDAO o null si no hay coincidencias.
   */
  UserDTO findUser(Long userId);

  /**
   * Busca todos los usuarios de la base de datos.
   * 
   * @return ArrayList<IUserDTO> con los usuarios.
   */
  List<UserDTO> findAll();

  /**
   * Busca un usuario con el ID ingresado.
   *
   * @param userCi CI del usuario.
   * @return objeto IUserDAO o null si no hay coincidencias.
   */
  UserDTO findUserByCi(Long userCi);



}
