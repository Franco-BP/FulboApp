package com.fulboapp.dao;

import java.util.List;
import com.fulboapp.dto.FieldDTO;

public interface IFieldDAO {

  /**
   * Agrega una cancha a la base de datos.
   *
   * @param field Objeto a agregar.
   */
  void addField(FieldDTO field);

  /**
   * Elimina una cancha existente de la base de datos.
   *
   * @param field Objeto a actualizar.
   */
  void deleteField(FieldDTO field);

  /**
   * Actualiza una cancha en la base de datos.
   *
   * @param field Objeto a eliminar.
   */
  void updateField(FieldDTO field);

  /**
   * Busca una cancha con el ID ingresado.
   *
   * @param fieldId ID de la cancha.
   * @return objeto FieldDTO o null si no hay coincidencias.
   */
  FieldDTO findField(Long fieldId);

  /**
   * Busca todas las canchas de la base de datos.
   * 
   * @return List<FieldDTO> con las canchas encontradas.
   */
  List<FieldDTO> findAll();

  /**
   * Busca todas las canchas que tengan el ingreso como parte de su ubicacion.
   * 
   * @param location ciudad o departamento.
   * @return List<FieldDTO> con las canchas que coincidan.
   */
  List<FieldDTO> findByLocation(String location);


}
