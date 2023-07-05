package com.fulboapp.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import com.fulboapp.repo.IFieldRepo;
import com.fulboapp.util.DozerUtil;
import com.fulboapp.model.Field;
import com.fulboapp.dao.IFieldDAO;
import com.fulboapp.dto.FieldDTO;

@Repository
public class FieldDAOImpl implements IFieldDAO {

	@Autowired
	private IFieldRepo repo;
	
	@Override
	public FieldDTO addField(FieldDTO fieldDTO) {
		// SE LLAMA A LA BD Y SE GUARDA EL OBJETO FIELD
		Field field = repo.save(DozerUtil.getINSTANCE().getMapper().map(fieldDTO, Field.class));
		// Se llama el mapper para pasar la entity a un DTO para el return.
		return DozerUtil.getINSTANCE().getMapper().map(field, FieldDTO.class);
	}

	@Override
	public void deleteField(FieldDTO fieldDTO) {
		// Se llama a la BD con la entity previamente mapeada desde el DTO.
		repo.delete(DozerUtil.getINSTANCE().getMapper().map(fieldDTO, Field.class));
	}

	@Override
	public FieldDTO updateField(FieldDTO fieldDTO) {
		// SE LLAMA A LA BD Y SE GUARDA EL OBJETO FIELD.
		Field field = repo.save(DozerUtil.getINSTANCE().getMapper().map(fieldDTO, Field.class));
		// Se llama el mapper para pasar la entity a un DTO para el return.
		return DozerUtil.getINSTANCE().getMapper().map(field, FieldDTO.class);
	}

	@Override
	public List<FieldDTO> findAll() {
		// Se llama a la BD para obtener todas las canchas.
		// Luego, se pasa a un stream secuencial y se mapea de Entities a DTOs.
		return repo.findAll().stream()
				.map(p -> DozerUtil.getINSTANCE().getMapper().map(p, FieldDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public FieldDTO findField(Integer id) {
		return DozerUtil.getINSTANCE().getMapper()
				.map(repo.findById(id), FieldDTO.class);
	}

	@Override
	public List<FieldDTO> findByName(String name) {
		// El Query esta definido en IFieldService.
		// Se llama a la BD, luego se pasa a un stream secuencial y se mapean las entities a DTOs.
		return repo.findByName(name).stream()
				.map(p -> DozerUtil.getINSTANCE().getMapper().map(p, FieldDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public List<FieldDTO> findByLocation(String location) {
		// El Query esta definido en IFieldService.
		// Se llama a la BD, luego se pasa a un stream secuencial y se mapean las entities a DTOs.
		return repo.findByLocation(location).stream()
				.map(p -> DozerUtil.getINSTANCE().getMapper().map(p, FieldDTO.class))
				.collect(Collectors.toList());
	}

}
