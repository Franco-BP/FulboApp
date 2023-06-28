package com.fulboapp.service;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fulboapp.dto.UserDTO;

public interface IUserService {

  List<UserDTO> getListAllUser();

  UserDTO addUser(UserDTO userDTO);

  void deleteUser(UserDTO userDTO);

  UserDTO updateUser(UserDTO userDTO);


  @Query("select p from Usuario p where p.ic = :id")
  UserDTO findUserByCi(@Param("ic") Long ci);

  /**
   * busqueda por varios campos, lo que se quiere es que cuando ingrese una letra, este se búsque en
   * los dos campos nombre y apellido no por separado la cual lo realiza la siguiente consulta
   * 
   */
  // @Query("select p from Persona p where p.nombre = :nombre or p.apellido = :apellido")
  // List<Persona> findByNameOrLastName(@Param("nombre") String nombre,
  // @Param("apellido") String apellido);// se quiere que reciba solo un parámetro pero que realice
  // // la búsqueda en los dos campos


}
