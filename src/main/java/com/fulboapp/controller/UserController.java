package com.fulboapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

  @GetMapping("/getUserSubscriptionsCost")
  public List<UserDTO> getListAllUser() {
    return iUserService.getListAllUser();
  }

  @GetMapping("/addUser")
  public UserDTO addUser(@RequestBody UserDTO userDTO) {
    return iUserService.addUser(userDTO);
  }

  @DeleteMapping("/deleteUser")
  public UserDTO deleteUser(@RequestBody UserDTO userDTO) {
    return iUserService.deleteUser(userDTO);
  }

  @GetMapping("/findUserByCi")
  public UserDTO findUserByCi(@RequestParam Long ci) {
    return iUserService.findUserByCi(ci);
  }

  @PutMapping("/updateUser")
  public UserDTO updateUser(@RequestBody UserDTO userDTO) {
    return iUserService.updateUser(userDTO);
  }

}