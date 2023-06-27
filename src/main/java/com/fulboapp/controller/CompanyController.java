package com.fulboapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fulboapp.dto.CompanyDTO;
import com.fulboapp.service.ICompanyService;

@RestController
public class CompanyController {

	@Autowired
	ICompanyService iCompanyService;

	@GetMapping("/addCompany")
	public CompanyDTO addCompany(@RequestBody CompanyDTO companyDTO) {
		return iCompanyService.addCompany(companyDTO);
	}

	@GetMapping("/updateCompany")
	public CompanyDTO updateCompany(@RequestBody CompanyDTO companyDTO) {
		return iCompanyService.updateCompany(companyDTO);
	}

	@GetMapping("/deleteCompany")
	public CompanyDTO deleteCompany(@RequestBody CompanyDTO companyDTO) {
		return iCompanyService.deleteCompany(companyDTO);
	}

	@GetMapping("/getListAllCompany")
	public CompanyDTO getListAllCompany(@RequestBody CompanyDTO companyDTO) {
		return iCompanyService.deleteCompany(companyDTO);
	}

	@GetMapping("/findCompanyById")
	public CompanyDTO findCompanyById(@RequestParam Long id) {
		return iCompanyService.findCompanyById(id);
	}

	@GetMapping("/findCompanyByName")
	public List<CompanyDTO> findCompanyByName(@RequestParam String name) {
		return iCompanyService.findCompanyByName(name);
	}
}
