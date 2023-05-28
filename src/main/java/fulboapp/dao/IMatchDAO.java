package fulboapp.dao;

import java.util.List;
import fulboapp.dto.MatchDTO;

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
	public void removeMatch(MatchDTO match);

	/**
	 * Actualiza los datos de un partido.
	 *
	 * @param match - objeto MatchDTO.
	 */
	public void updateMatch(MatchDTO match);
	
	/**
	 * Busca el partido con el ID ingresado.
	 *
	 * @param matchID - String del ID.
	 * @return objeto MatchDTO o null si no hay coincidencias.
	 */
	public MatchDTO findMatch(String matchID);

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

}
