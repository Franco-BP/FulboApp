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
	
	/**
	 * Lista todos las canchas.
	 * @return
	 */
	@GetMapping("/getListAllField")
	public List<FieldDTO> getListAllField() {
		return iFieldService.getListAllField();
	}
	
	/**
	 * Agrega una nueva cancha.
	 * @param fieldDTO
	 * @return objeto FieldDTO agregado a la base de datos.
	 */
	@PostMapping("/addField")
	public FieldDTO addField(@RequestBody FieldDTO fieldDTO) {
		return iFieldService.addField(fieldDTO);
	}
	
	/**
	 * Elimina una cancha existente.
	 * @param fieldDTO
	 * @return objeto FieldDTO con datos vacios si se elimina correctamente.
	 */
	@DeleteMapping("/deleteField")
	public FieldDTO deleteField(@RequestBody FieldDTO fieldDTO) {
		return iFieldService.addField(fieldDTO);
	}
	
	/**
	 * Actualiza un objeto de FieldDTO.
	 * @param fieldDTO
	 * @return objeto FieldDTO actualizado.
	 */
	@PutMapping("/updateField")
	public FieldDTO updateField(@RequestBody FieldDTO fieldDTO) {
		return iFieldService.updateField(fieldDTO);
	}
	
	/**
	 * Busca una cancha por su nombre.
	 * @param name
	 * @return objeto que coincida con el String ingresado.
	 */
	@GetMapping("/findFieldByName")
	public FieldDTO findFieldByName(@RequestParam String name) {
		return iFieldService.findFieldByName(name);
	}
	
	/**
	 * Busca una cancha por su id.
	 * @param id
	 * @return
	 */
	@GetMapping("/findFieldById")
	public FieldDTO findFieldById(@RequestParam Long id) {
		return iFieldService.findFieldById(id);
	}
	
	/**
	 * Busca canchas por ubicacion.
	 * @param location
	 * @return Lista de FieldDTO con las canchas que coincidan.
	 */
	@GetMapping("/findByLocation")
	public List<FieldDTO> findByLocation(@RequestParam String location) {
		return iFieldService.findByLocation(location);
	}

}
