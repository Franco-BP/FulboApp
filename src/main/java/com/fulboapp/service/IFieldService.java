package com.fulboapp.service;

import com.fulboapp.dto.FieldDTO;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFieldService {

	List<FieldDTO> getListAllField();
	
	FieldDTO addField(FieldDTO fieldDTO);
	
	void deleteField(FieldDTO fieldDTO);
	
	FieldDTO updateField(FieldDTO fieldDTO);
	
	FieldDTO findField(Integer id);
	
	@Query("select p from Cancha p where p.nombre = :nombre")
	List<FieldDTO> findByName(@Param("nombre") String name);
	
	@Query("select p from Cancha p where p.ubicacion = :ubicacion")
	List<FieldDTO> findByLocation(@Param("ubicacion") String location);
}
