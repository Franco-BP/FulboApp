package com.fulboapp.service;

import java.util.Date;
import java.util.List;
import com.fulboapp.dto.MatchDTO;

public interface IMatchService {

  public List<MatchDTO> getAll();

  // No se como poner los parametros, si pedir el id o el objeto.
  // Si es el objeto, no se si pedir la entidad o el DTO.

  /**
   * Metodo para chequear la disponibilidad de cupos en un partido.
   * 
   * @param matchId id del partido a chequear.
   * @return null si esta lleno, true si tiene cupos.
   */
  public Boolean getAvailability(Long matchId);

  /**
   * Metodo para chequear la disponibilidad de cupos para un jugador particular.
   * 
   * @param matchId id del partido a chequear.
   * @param userId id del jugador a chequear.
   * @return null si esta lleno, false si el jugador esta repetido y true si tiene cupos.
   */
  public Boolean getAvailability(Long matchId, Long userId);

  /**
   * Metodo para obtener todos los partidos.
   * 
   * @return List<MatchDTO> con todos los partidos.
   */
  public List<MatchDTO> getListAllMatches(Boolean avoidFulls);

  /**
   * Metodo para obtener un partido.
   * 
   * @param matchId - Long con el id del partido.
   * @return MatchDTO - null si no hay coincidencias.
   */
  public MatchDTO getMatch(Long matchId);

  /**
   * Metodo para eliminar un partido
   * 
   * @param matchId - Long con el id del partido.
   */
  public void deleteMatch(Long matchId);

  // No estoy seguro de que sea necesario el update como servicio.
  public void updateMatch(Long matchId);

  /**
   * Metodo para agregar un jugador al partido.
   * 
   * @param matchId id del partido.
   * @param userId id del jugador.
   */
  public void addPlayer(Long matchId, Long userId);

  /**
   * Metodo para eliminar un jugador de un partido.
   * 
   * @param matchId id del partido.
   * @param userId id del jugador
   */
  public void deletePlayer(Long matchId, Long userId);

  /**
   * Metodo para setear la fecha del partido.
   * 
   * @param matchId id del partido.
   * @param date fecha en formato "yyyy-MM-dd,kk-mm" donde las horas [kk] = (1->23)
   */
  public Boolean setDate(Long matchId, Date date);
}
