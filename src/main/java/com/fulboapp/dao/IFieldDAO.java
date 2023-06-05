package com.fulboapp.dao;

import java.util.List;
import com.fulboapp.dto.FieldDTO;

public interface IFieldDAO {

	/**
	 * Busca una cancha con el ID ingresado.
	 *
	 * @param fieldID ID de la cancha.
	 * @return objeto FieldDTO o null si no hay coincidencias.
	 */
	public FieldDTO findField(Long fieldID);

	/**
	 * Busca todas las canchas de la base de datos.
	 * 
	 * @return List<FieldDTO> con las canchas encontradas.
	 */
	public List<FieldDTO> findAll();

	/**
	 * Busca todas las canchas que tengan el ingreso como parte de su ubicacion.
	 * 
	 * @param location ciudad o departamento.
	 * @return List<FieldDTO> con las canchas que coincidan.
	 */
	public List<FieldDTO> findByLocation(String location);

	/**
	 * Agrega una cancha a la base de datos.
	 *
	 * @param field Objeto a agregar.
	 */
	public void addField(FieldDTO field);

	/**
	 * Elimina una cancha existente de la base de datos.
	 *
	 * @param field Objeto a actualizar.
	 */
	public void removeField(FieldDTO field);

	/**
	 * Actualiza una cancha en la base de datos.
	 *
	 * @param field Objeto a eliminar.
	 */
	public void updateField(FieldDTO field);
}
