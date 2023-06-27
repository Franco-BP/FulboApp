package com.fulboapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fulboapp.dto.FieldDTO;
import com.fulboapp.service.IFieldService;

@RestController
public class FieldController {

	@Autowired
	IFieldService iFieldService;
	
	@GetMapping("/getListAllField")
	public List<FieldDTO> getListAllField() {
		return iFieldService.getListAllField();
	}
	
	@PostMapping("/addField")
	public void addField(@RequestBody FieldDTO fieldDTO) {
		// No entiendo por que el metodo en User debe devolver un DTO si solamente lo va a agregar.
		// Seria lo mismo que en getListAllUser pero al reves.
		iFieldService.addField(fieldDTO);
	}
	
	@DeleteMapping("/deleteField")
	public void deleteField(@RequestBody FieldDTO fieldDTO) {
		iFieldService.addField(fieldDTO);
	}
	
	@PutMapping("/updateField")
	public void updateField(@RequestBody FieldDTO fieldDTO) {
		iFieldService.updateField(fieldDTO);
	}
	
	@GetMapping("/findFieldByName")
	public FieldDTO findFieldByName(@RequestParam String name) {
		return iFieldService.findFieldByName(name);
	}
	
	@GetMapping("/findFieldById")
	public FieldDTO findFieldById(@RequestParam Long id) {
		return iFieldService.findFieldById(id);
	}
	
	@GetMapping("/findByLocation")
	public List<FieldDTO> findByLocation(@RequestParam String location) {
		return iFieldService.findByLocation(location);
	}
	
}
