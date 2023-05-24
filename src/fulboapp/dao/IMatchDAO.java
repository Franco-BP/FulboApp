package fulboapp.dao;

import java.util.ArrayList;

/**
 *
 * @author Franco Bascialla
 */
public interface IMatchDAO {

	/**
	 * Busca el partido con el ID ingresado.
	 *
	 * @param matchID String del ID.
	 * @return objeto IMatchDAO o null si no hay coincidencias.
	 */
	public IMatchDAO findMatch(String matchID);

	/**
	 * Agrega un nuevo partido.
	 *
	 * @param match objeto IMatchDAO.
	 */
	public void addMatch(IMatchDAO match);

	/**
	 * Elimina un partido.
	 *
	 * @param match objeto IMatchDAO.
	 */
	public void removeMatch(IMatchDAO match);

	/**
	 * Actualiza los datos de un partido.
	 *
	 * @param match objeto IMatchDAO.
	 */
	public void updateMatch(IMatchDAO match);

	/**
	 * Busca los partidos guardados.
	 *
	 * @param avoidFulls True si se desea solo los partidos con cupos.
	 * @return ArrayList<IMatchDAO> que cumplen con la condición de ingreso.
	 */
	public ArrayList<IMatchDAO> findAll(boolean avoidFulls);

	/**
	 * Busca los partidos de un día particular.
	 *
	 * @param date       Día a buscar en SimpleDateFormat("dd-MM-yyyy").
	 * @param avoidFulls True si se desea solo los partidos con cupos.
	 * @return ArrayList<IMatchDAO> que cumplen con la condición de ingreso.
	 */
	public ArrayList<IMatchDAO> findMatchesByDate(String date, boolean avoidFulls);

}
