package com.fulboapp.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.fulboapp.model.Company;
import com.fulboapp.model.Field;
import com.fulboapp.dao.IFieldDAO;
import com.fulboapp.dto.CompanyDTO;
import com.fulboapp.dto.FieldDTO;

@Repository
public class FieldDAOImpl implements IFieldDAO {

	@Override
	public FieldDTO addField(FieldDTO fieldDTO) {
		Field field = new Field();
		field.setCalendar(fieldDTO.getCalendar());
		field.setId(fieldDTO.getId());
		field.setLocation(fieldDTO.getLocation());
		field.setName(fieldDTO.getName());

		CompanyDTO companyDTO = fieldDTO.getOwner();
		Company company = new Company();
		company.setCompanyName(companyDTO.getCompanyName());
		company.setEmail(companyDTO.getEmail());
		company.setId(companyDTO.getId());
		company.setPhoneNumber(companyDTO.getPhoneNumber());
		field.setOwner(company);

		// SE LLAMA A LA BD Y SE GUARDA EL OBJETO FIELD
		return fieldDTO;
	}

	@Override
	public FieldDTO deleteField(FieldDTO fieldDTO) {
		// SE LLAMA A LA BD Y SE BORRA EL OBJETO FIELD
		return new FieldDTO();
	}

	@Override
	public FieldDTO updateField(FieldDTO fieldDTO) {
		// SE LLAMA A LA BD Y SE HACE UN UPDATE
		return new FieldDTO();
	}

	/**
	 * Se simula ir a la base de datos y buscar todas las canchas.
	 */
	@Override
	public List<FieldDTO> getListAllField() {
		// SE LLAMARIA A LA BD Y SE BUSCARIAN TODOS LOS FIELDS.
		// LUEGO SE PASAN TODAS LAS ENTITIES A DTOs.
		return Arrays.asList(new FieldDTO(), new FieldDTO(), new FieldDTO());
	}

	@Override
	public FieldDTO findFieldById(Long fieldId) {
		// SE LLAMA A LA BD Y SE BUSCA UN FIELD QUE COINCIDA.
		Field field = new Field(); // Simula haber encontrado el objeto.

		FieldDTO fieldDTO = new FieldDTO();
		if (field != null) {
			fieldDTO.setCalendar(field.getCalendar());
			fieldDTO.setId(field.getId());
			fieldDTO.setLocation(field.getLocation());
			fieldDTO.setName(field.getName());

			Company company = field.getOwner();
			CompanyDTO companyDTO = new CompanyDTO();
			companyDTO.setCompanyName(company.getCompanyName());
			companyDTO.setEmail(company.getEmail());
			companyDTO.setId(company.getId());
			companyDTO.setPhoneNumber(company.getPhoneNumber());
			fieldDTO.setOwner(companyDTO);
		}

		/*** Seria buena practica devolver un null si no se halla el field? ***/
		return fieldDTO;
	}

	@Override
	public FieldDTO findFieldByName(String name) {
		// SE LLAMA A LA BD Y SE BUSCA UN FIELD QUE COINCIDA.
		Field field = new Field(); // Simula haber encontrado el objeto.

		FieldDTO fieldDTO = new FieldDTO();
		if (field != null) {
			fieldDTO.setCalendar(field.getCalendar());
			fieldDTO.setId(field.getId());
			fieldDTO.setLocation(field.getLocation());
			fieldDTO.setName(field.getName());

			Company company = field.getOwner();
			CompanyDTO companyDTO = new CompanyDTO();
			companyDTO.setCompanyName(company.getCompanyName());
			companyDTO.setEmail(company.getEmail());
			companyDTO.setId(company.getId());
			companyDTO.setPhoneNumber(company.getPhoneNumber());
			fieldDTO.setOwner(companyDTO);
		}

		/*** Seria buena practica devolver un null si no se halla el field? ***/
		return fieldDTO;
	}

	@Override
	public List<FieldDTO> findByLocation(String location) {
		// SE LLAMA A LA BD Y SE BUSCA UN FIELD QUE COINCIDA.
		List<Field> fieldList = Arrays.asList(new Field(), new Field(), new Field());
		// Simula haber encontrado el objeto.

		List<FieldDTO> fieldDTOList = new ArrayList<>();
		if (fieldList != null) {
			for (Field element : fieldList) {
				FieldDTO fieldDTO = new FieldDTO();
				fieldDTO.setCalendar(element.getCalendar());
				fieldDTO.setId(element.getId());
				fieldDTO.setLocation(element.getLocation());
				fieldDTO.setName(element.getName());

				Company company = element.getOwner();
				CompanyDTO companyDTO = new CompanyDTO();
				companyDTO.setCompanyName(company.getCompanyName());
				companyDTO.setEmail(company.getEmail());
				companyDTO.setId(company.getId());
				companyDTO.setPhoneNumber(company.getPhoneNumber());
				fieldDTO.setOwner(companyDTO);

				fieldDTOList.add(fieldDTO);
			}
		}

		/*** Seria buena practica devolver un null si no se halla nada? ***/
		return fieldDTOList;
	}

}
