package com.fulboapp.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.fulboapp.dao.IFieldDAO;
import com.fulboapp.dto.FieldDTO;

@Repository
public class FieldDAOImpl implements IFieldDAO {

	@Override
	public FieldDTO findField(Long fieldID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FieldDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FieldDTO> findByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addField(FieldDTO field) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeField(FieldDTO field) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateField(FieldDTO field) {
		// TODO Auto-generated method stub
		
	}
}
