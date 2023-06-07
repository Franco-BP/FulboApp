package fulboapp.dao;

import java.util.List;
import fulboapp.dto.MatchDTO;
import fulboapp.dto.UserDTO;

public interface IMatchDAO {	

	/**
	 * Agrega un nuevo partido.
	 *
	 * @param match - objeto MatchDTO.
	 */
	public void addMatch(MatchDTO match);

	/**
	 * Elimina un partido.
	 *
	 * @param match - objeto MatchDTO.
	 */
	public void deleteMatch(MatchDTO match);

	/**
	 * Actualiza los datos de un partido.
	 *
	 * @param match - objeto MatchDTO.
	 */
	public void updateMatch(MatchDTO match);
	
	/**
	 * Busca el partido con el ID ingresado.
	 *
	 * @param matchId - Long del ID.
	 * @return objeto MatchDTO o null si no hay coincidencias.
	 */
	public MatchDTO findMatch(Long matchId);

	/**
	 * Busca los partidos guardados.
	 *
	 * @param avoidFulls - True si se desea solo los partidos con cupos.
	 * @return List<MatchDTO> que cumplen con la condición de ingreso.
	 */
	public List<MatchDTO> findAll(boolean avoidFulls);

	/**
	 * Busca los partidos de un día particular.
	 *
	 * @param date       - Día a buscar en SimpleDateFormat("yyyy-MM-dd").
	 * @param avoidFulls - True si se desea solo los partidos con cupos.
	 * @return ArrayList<MatchDTO> que cumplen con la condición de ingreso.
	 */
	public List<MatchDTO> findMatchesByDate(String date, boolean avoidFulls);
	
	/**
	 * Agrega un jugador al partido.
	 * @param userDTO jugador UserDTO a agregar.
	 */
	public void addPlayer(UserDTO userDTO);
	
	/**
	 * Elimina un jugador del partido.
	 * @param userDTO jugador UserDTO a eliminar.
	 * @return false si el jugador no existe, true si se pudo eliminar.
	 */
	public Boolean deletePlayer(UserDTO userDTO);
	
	/**
	 * Agrega jugadores invitados con la cantidad especificada.
	 * @param userDTO jugador que hace la invitacion.
	 * @param Amount cantidad de invitados a agregar.
	 */
	public void addInvitedPlayers(UserDTO userDTO, Integer Amount);
	
	/**
	 * Elimina la cantidad de invitados especificada. Si la cantidad ingresada es mayor que la cantidad,
	 * se eliminan de igual manera todos los que esten asignados a el jugador.
	 * 
	 * @param userDTO jugador que hizo la invitacion.
	 * @param Amount cantidad de invitados a eliminar.
	 * @return null si el jugador no tiene invitados, false si la cantidad es mas que los invitados y true si se hizo.
	 */
	public Boolean deleteInvitedPlayers(UserDTO userDTO, Integer Amount);

}
