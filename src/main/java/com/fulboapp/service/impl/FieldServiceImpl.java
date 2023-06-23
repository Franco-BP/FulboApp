package com.fulboapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fulboapp.dao.IFieldDAO;
import com.fulboapp.dto.FieldDTO;
import com.fulboapp.service.IFieldService;

@Service
public class FieldServiceImpl implements IFieldService {

	@Autowired
	IFieldDAO iFieldDAO;

	@Override
	public List<FieldDTO> getListAllField() {
		return iFieldDAO.getListAllField();
	}

	@Override
	public FieldDTO addField(FieldDTO fieldDTO) {
		return iFieldDAO.addField(fieldDTO);
	}

	@Override
	public FieldDTO deleteField(FieldDTO fieldDTO) {
		return iFieldDAO.deleteField(fieldDTO);
	}

	@Override
	public FieldDTO updateField(FieldDTO fieldDTO) {
		return iFieldDAO.updateField(fieldDTO);
	}

	@Override
	public FieldDTO findFieldById(Long id) {
		return iFieldDAO.findFieldById(id);
	}

	@Override
	public FieldDTO findFieldByName(String name) {
		return iFieldDAO.findFieldByName(name);
	}

	@Override
	public List<FieldDTO> findByLocation(String location) {
		return iFieldDAO.findByLocation(location);
	}

}
