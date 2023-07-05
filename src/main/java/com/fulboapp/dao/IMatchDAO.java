package com.fulboapp.dao;

import java.util.List;
import com.fulboapp.dto.MatchDTO;

public interface IMatchDAO {

  /**
   * Metodo que nos devuelve todos los Match cargados
   */

  List<MatchDTO> getAll();

  /**
   * Agrega un nuevo partido.
   *
   * @param match - objeto MatchDTO.
   */
  void addMatch(MatchDTO match);

  /**
   * Elimina un partido.
   *
   * @param match - objeto MatchDTO.
   */
  void removeMatch(MatchDTO match);

  /**
   * Actualiza los datos de un partido.
   *
   * @param match - objeto MatchDTO.
   */
  void updateMatch(MatchDTO match);

  /**
   * Busca el partido con el ID ingresado.
   *
   * @param matchID - Long del ID.
   * @return objeto MatchDTO o null si no hay coincidencias.
   */
  MatchDTO findMatch(Integer matchID);

  /**
   * Busca los partidos guardados.
   *
   * @param avoidFulls - True si se desea solo los partidos con cupos.
   * @return List<MatchDTO> que cumplen con la condición de ingreso.
   */
  List<MatchDTO> findAll(boolean avoidFulls);

  /**
   * Busca los partidos de un día particular.
   *
   * @param date - Día a buscar en SimpleDateFormat("yyyy-MM-dd").
   * @param avoidFulls - True si se desea solo los partidos con cupos.
   * @return ArrayList<MatchDTO> que cumplen con la condición de ingreso.
   */
  List<MatchDTO> findMatchesByDate(String date, boolean avoidFulls);

}
