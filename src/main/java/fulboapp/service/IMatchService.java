package fulboapp.service;

import java.util.Date;
import java.util.List;

import fulboapp.dto.MatchDTO;

public interface IMatchService {
	
	/**
	 * Metodo para obtener un partido.
	 * @param matchId - Long con el id del partido.
	 * @return MatchDTO - null si no hay coincidencias.
	 */
	public MatchDTO getMatch(Long matchId);
	
	/**
	 * Metodo para eliminar un partido
	 * @param matchId - Long con el id del partido.
	 */
	public void deleteMatch(Long matchId);
	
	/**
	 * Metodo para hacer update a un partido.
	 * @param matchId - Long con el id del partido.
	 */
	public void updateMatch(Long matchId);
	
	/**
	 * Metodo para obtener todos los partidos.
	 * @return List<MatchDTO> con todos los partidos.
	 */
	public List<MatchDTO> getListAllMatches(Boolean avoidFulls);
	
	/**
	 * Metodo para agregar un jugador al partido.
	 * @param matchId id del partido.
	 * @param userId id del jugador.
	 */
	public void addPlayer(Long matchId, Long userId);
	
	/**
	 * Metodo para eliminar un jugador de un partido.
	 * @param matchId id del partido.
	 * @param userId id del jugador
	 */
	public void deletePlayer(Long matchId, Long userId);
	
	/**
	 * Metodo para agregar jugadores invitados a un partido.
	 * @param matchId id del partido
	 * @param userId id del jugador que invita
	 * @param amount cantidad de jugadores invitados
	 */
	public void addInvitedPlayers(Long matchId, Long userId, Integer amount);
	
	/**
	 * Metodo para eliminar jugadores invitados a un partido.
	 * @param matchId id del partido
	 * @param userId id del jugador que invito.
	 * @param amount cantidad de jugadores a eliminar. * 10 para eliminar todos. * 
	 */
	public void deleteInvitedPlayers(Long matchId, Long userId, Integer amount);
	
	/**
	 * Metodo para chequear la disponibilidad de cupos en un partido.
	 * @param matchId id del partido a chequear.
	 * @return null si esta lleno, true si tiene cupos.
	 */
	public Boolean getAvailability(Long matchId);
	
	/**
	 * Metodo para chequear la disponibilidad de cupos para un jugador particular.
	 * @param matchId id del partido a chequear.
	 * @param userId id del jugador a chequear.
	 * @return null si esta lleno, false si el jugador esta repetido y true si tiene cupos.
	 */
	public Boolean getAvailabilityForUser(Long matchId, Long userId);
	
	/**
	 * Metodo para setear la fecha del partido.
	 * @param matchId id del partido.
	 * @param date fecha en formato "yyyy-MM-dd,kk-mm" donde las horas [kk] = (1->23) 
	 */
	
	/**
	 * Metodo para setear la fecha del partido.
	 * @param matchId id Long del partido.
	 * @param date fecha en formato "yyyy-MM-dd,kk-mm" donde las horas [kk] = (1->23) 
	 * @return True si se pudo setear bien.
	 */
	public Boolean setDate(Long matchId, Date date);
}