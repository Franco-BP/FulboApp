package com.fulboapp.service;

import com.fulboapp.dto.FieldDTO;
import java.util.List;

public interface IFieldService {

	List<FieldDTO> getListAllField();
	
	void addField(FieldDTO fieldDTO);
	
	void deleteField(FieldDTO fieldDTO);
	
	void updateField(FieldDTO fieldDTO);
	
	FieldDTO findFieldById(Long id);
	
	FieldDTO findFieldByName(String name);
	
	List<FieldDTO> findByLocation(String location);
}
