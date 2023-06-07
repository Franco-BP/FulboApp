package fulboapp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fulboapp.dto.MatchDTO;
import fulboapp.service.IMatchService;

@RestController
public class MatchController {

	@Autowired
	private IMatchService iMatchService;

	/**
	 * Metodo para obtener un partido particular.
	 * @param matchId - Long con el id del partido. 
	 * @return MatchDTO o null si no hay coincidencias.
	 */
	@GetMapping("/match/getMatch")
	public MatchDTO getMatch(@RequestBody Long matchId) {
		return iMatchService.getMatch(matchId);
	}
	
	/**
	 * Metodo para eliminar un partido.
	 * @param matchId id del partido
	 */
	@DeleteMapping("/match/deleteMatch")
	public void deleteMatch(@RequestBody Long matchId) {
		iMatchService.deleteMatch(matchId);
	}
	
	/**
	 * Metodo para hacer el update de un partido.
	 * @param matchId id del partido.
	 */
	@PutMapping("/match/updatePlayers")
	public void updateMatch(@RequestBody Long matchId) {
		iMatchService.updateMatch(matchId);
	}
	
	/**
	 * Metodo para obtener todos los partidos.
	 * @param avoidFulls - True si se desea evitar los partidos ya completos.
	 * @return List<MatchDTO> - Lista de los partidos encontrados.
	 */
	@GetMapping("/match/getListAllMatches")
	public List<MatchDTO> getListAllMatches(@RequestBody Boolean avoidFulls) {
		return iMatchService.getListAllMatches(avoidFulls);
	}
	
	/**
	 * Metodo para agregar un jugador al partido.
	 * 
	 * @param matchId id del partido.
	 * @param userId  id del jugador.
	 */
	@PostMapping("/match/addPlayer")
	public void addPlayer(@RequestBody Long matchId, @RequestBody Long userId) {
		iMatchService.addPlayer(matchId, userId);
	}

	/**
	 * Metodo para eliminar un jugador de un partido.
	 * 
	 * @param matchId id del partido.
	 * @param userId  id del jugador
	 */
	@DeleteMapping("/match/deletePlayer")
	public void deletePlayer(@RequestBody Long matchId, @RequestBody Long userId) {
		iMatchService.deletePlayer(matchId, userId);
	}
	
	/**
	 * Metodo para agregar un jugador al partido.
	 * 
	 * @param matchId id del partido.
	 * @param userId  id del jugador.
	 */
	@PostMapping("/match/addInvitedPlayers")
	public void addInvitedPlayers(@RequestBody Long matchId, @RequestBody Long userId, @RequestBody Integer amount) {
		iMatchService.addInvitedPlayers(matchId, userId, amount);
	}
	
	/**
	 * Metodo para chequear la disponibilidad de cupos para un partido.
	 * @param matchId id del partido.
	 * @return null si esta lleno, true si tiene cupos.
	 */
	@GetMapping("/match/getAvailability")
	public Boolean getAvailability(@RequestBody Long matchId) {
		return iMatchService.getAvailability(matchId);
	}

	/**
	 * Metodo para chequear la disponibilidad de cupos para un jugador particular.
	 * 
	 * @param matchId id del partido a chequear.
	 * @param userId  id del jugador a chequear.
	 * @return null si esta lleno, false si el jugador esta repetido y true si tiene
	 *         cupos.
	 */
	@GetMapping("/match/getAvailabilityForUser")
	public Boolean getAvailabilityForUser(@RequestBody Long matchId, @RequestBody Long userId) {
		return iMatchService.getAvailabilityForUser(matchId, userId);
	}

	/**
	 * Metodo para setear la fecha del partido.
	 * 
	 * @param matchId id del partido.
	 * @param date    fecha en formato "yyyy-MM-dd,kk-mm" donde las horas [kk] =
	 *                (1->23)
	 */
	@PostMapping("/match/setDate")
	public Boolean setDate(@RequestBody Long matchId, @RequestBody Date date) {
		return iMatchService.setDate(matchId, date);
	}
}
