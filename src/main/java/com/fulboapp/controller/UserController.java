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

}
