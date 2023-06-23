package com.fulboapp.service;

import com.fulboapp.dto.FieldDTO;
import java.util.List;

public interface IFieldService {

	List<FieldDTO> getListAllField();
	
	FieldDTO addField(FieldDTO fieldDTO);
	
	FieldDTO deleteField(FieldDTO fieldDTO);
	
	FieldDTO updateField(FieldDTO fieldDTO);
	
	FieldDTO findFieldById(Long id);
	
	FieldDTO findFieldByName(String name);
	
	List<FieldDTO> findByLocation(String location);
}
