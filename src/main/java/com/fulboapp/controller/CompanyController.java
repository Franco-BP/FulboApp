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

import com.fulboapp.dto.CompanyDTO;
import com.fulboapp.service.ICompanyService;

@RestController
public class CompanyController {

	@Autowired
	ICompanyService iCompanyService;

	/**
	 * Agrega una nueva compania.
	 * @param companyDTO
	 * @return objeto CompanyDTO agregado a la BD.
	 */
	@PostMapping("/addCompany")
	public CompanyDTO addCompany(@RequestBody CompanyDTO companyDTO) {
		return iCompanyService.addCompany(companyDTO);
	}

	/**
	 * Elimina una compania existente.
	 * @param companyDTO
	 * @return	objeto CompanyDTO vacio si se elimino correctamente.
	 */
	@DeleteMapping("/deleteCompany")
	public CompanyDTO deleteCompany(@RequestBody CompanyDTO companyDTO) {
		return iCompanyService.deleteCompany(companyDTO);
	}
	
	/**
	 * Actualiza una compania.
	 * @param companyDTO
	 * @return objeto CompanyDTO actualizado.
	 */
	@PutMapping("/updateCompany")
	public CompanyDTO updateCompany(@RequestBody CompanyDTO companyDTO) {
		return iCompanyService.updateCompany(companyDTO);
	}

	/**
	 * Busca todas las companias guardadas en la BD.
	 * @param companyDTO
	 * @return Lista de CompanyDTO con todas las companias.
	 */
	@GetMapping("/getListAllCompany")
	public List<CompanyDTO> getListAllCompany() {
		return iCompanyService.getListAllCompany();
	}

	/**
	 * Busca una compania por el id.
	 * @param id
	 * @return objeto CompanyDTO que coincida.
	 */
	@GetMapping("/findCompanyById")
	public CompanyDTO findCompanyById(@RequestParam Long id) {
		return iCompanyService.findCompanyById(id);
	}

	/**
	 * Busca una compania por el nombre.
	 * @param name
	 * @return	objeto CompanyDTO que coincida.
	 */
	@GetMapping("/findCompanyByName")
	public List<CompanyDTO> findCompanyByName(@RequestParam String name) {
		return iCompanyService.findCompanyByName(name);
	}
}
