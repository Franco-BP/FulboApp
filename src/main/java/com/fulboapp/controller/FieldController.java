package com.fulboapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	// Por que se usa el GetMapping si se esta haciendo un Post?
	// Reconozco que no es void, pero aun asi es necesario declararlo como un get?
	@GetMapping("/addField")
	public FieldDTO addField(@RequestBody FieldDTO fieldDTO) {
		// No entiendo por que el metodo en User debe devolver un DTO si solamente lo va a agregar.
		// Seria lo mismo que en getListAllUser pero al reves.
		return iFieldService.addField(fieldDTO);
	}
	
	@GetMapping("/deleteField")
	public FieldDTO deleteField(@RequestBody FieldDTO fieldDTO) {
		return iFieldService.addField(fieldDTO);
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
	
	@GetMapping("/updateField")
	public FieldDTO updateField(@RequestBody FieldDTO fieldDTO) {
		return iFieldService.updateField(fieldDTO);
	}
}
