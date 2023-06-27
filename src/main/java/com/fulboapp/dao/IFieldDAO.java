package com.fulboapp.dao;

import java.util.List;
import com.fulboapp.dto.FieldDTO;

public interface IFieldDAO {

  /**
   * Agrega una nueva cancha a la base de datos.
   *
   * @param field Objeto a agregar.
   */
  FieldDTO addField(FieldDTO fieldDTO);

  /**
   * Elimina una cancha existente de la base de datos.
   *
   * @param field Objeto a actualizar.
   */
  FieldDTO deleteField(FieldDTO fieldDTO);

  /**
   * Actualiza una cancha en la base de datos.
   *
   * @param field Objeto a eliminar.
   */
  FieldDTO updateField(FieldDTO fieldDTO);
  
  /**
   * Busca todas las canchas de la base de datos.
   * 
   * @return List<FieldDTO> con las canchas encontradas.
   */
  List<FieldDTO> getListAllField();

  /**
   * Busca una cancha con el ID ingresado.
   *
   * @param fieldId ID de la cancha.
   * @return objeto FieldDTO o null si no hay coincidencias.
   */
  FieldDTO findFieldById(Long fieldId);
  
  /**
   * Busca una cancha con el nombre ingresado.
   *
   * @param fieldName Name de la cancha.
   * @return objeto FieldDTO o null si no hay coincidencias.
   */
  FieldDTO findFieldByName(String name);

  /**
   * Busca todas las canchas que tengan el ingreso como parte de su ubicacion.
   * 
   * @param location ciudad o departamento.
   * @return List<FieldDTO> con las canchas que coincidan.
   */
  List<FieldDTO> findByLocation(String location);


}
