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
		return iFieldDAO.findAll();
	}

	@Override
	public FieldDTO addField(FieldDTO fieldDTO) {
		return iFieldDAO.addField(fieldDTO);
	}

	@Override
	public void deleteField(FieldDTO fieldDTO) {
		iFieldDAO.deleteField(fieldDTO);
	}

	@Override
	public FieldDTO updateField(FieldDTO fieldDTO) {
		return iFieldDAO.updateField(fieldDTO);
	}

	@Override
	public FieldDTO findField(Integer id) {
		return iFieldDAO.findField(id);
	}

	@Override
	public List<FieldDTO> findByName(String name) {
		return iFieldDAO.findByName(name);
	}

	@Override
	public List<FieldDTO> findByLocation(String location) {
		return iFieldDAO.findByLocation(location);
	}

}
