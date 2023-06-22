package com.fulboapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fulboapp.dto.UserDTO;
import com.fulboapp.service.IUserService;

@RestController
public class UserController {

  @Autowired
  private IUserService iUserService;

  /**
   * Devuelve la lista completa de usuarios del sistema.
   * 
   * @param userDTO
   * @return
   */
  @GetMapping("/getUserSubscriptionsCost")
  public List<UserDTO> getListAllUser(@RequestBody UserDTO userDTO) {
    return iUserService.getListAllUser();
  }

  @GetMapping("/addUser")
  public UserDTO addUser(@RequestBody UserDTO userDTO) {
    return iUserService.addUser(userDTO);
  }

  @GetMapping("/deleteUser")
  public UserDTO deleteUser(@RequestBody UserDTO userDTO) {
    return iUserService.addUser(userDTO);
  }

  @GetMapping("/findUserByCi")
  public UserDTO findUserByCi(@RequestBody Long ci) {
    // return iUserService.addUser(userDTO);
    return null;
  }

  @GetMapping("/updateUser")
  public UserDTO updateUser(@RequestBody UserDTO userDTO) {
    return iUserService.addUser(userDTO);
  }

}
