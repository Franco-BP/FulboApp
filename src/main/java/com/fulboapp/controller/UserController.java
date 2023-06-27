package com.fulboapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fulboapp.dto.UserDTO;
import com.fulboapp.service.IUserService;

@RestController
public class UserController {

  @Autowired
  private IUserService iUserService;

  /**
   * GET para consultar y leer 
   * POST para crear 
   * PUT para editar 
   * DELETE para eliminar.
   */

  /**
   * Agrega un nuevo usuario.
   * 
   * @param userDTO
   * @return objeto UserDTO agregado a la base de datos.
   */
  @PostMapping("/addUser")
  public UserDTO addUser(@RequestBody UserDTO userDTO) {
    return iUserService.addUser(userDTO);
  }

  /**
   * Borra un usuario.
   * 
   * @param userDTO
   * @return objeto UserDTO con datos vacios si se elimino correctamente.
   */
  @DeleteMapping("/deleteUser")
  public UserDTO deleteUser(@RequestBody UserDTO userDTO) {
    return iUserService.deleteUser(userDTO);
  }
  
  /**
   * Actualiza un usuario previamente cargado.
   * 
   * @param userDTO
   * @return
   */
  @PutMapping("/updateUser")
  public UserDTO updateUser(@RequestBody UserDTO userDTO) {
    return iUserService.updateUser(userDTO);
  }

  /**
   * Busca un usario por CI.
   * 
   * @param ci
   * @return
   */
  @GetMapping("/findUserByCi")
  public UserDTO findUserByCi(@RequestParam Long ci) {
    return iUserService.findUserByCi(ci);
  }

  /**
   * Lista de todos los usuarios.
   * 
   * @return
   */
  @GetMapping("/getListAllUser")
  public List<UserDTO> getListAllUser() {
    return iUserService.getListAllUser();
  }

}
