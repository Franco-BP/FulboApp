package fulboapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import fulboapp.dto.MatchDTO;
import fulboapp.service.IMatchService;

@RestController
public class MatchController {

	@Autowired
	private IMatchService iMatchService;

	// No se que se pone en el GetMapping. Por lo que encontre,
	// es algo vinculado a la url donde se ubica el metodo.
	//
	// Por lo que encontre, el RequestBody se usa solo para objetos,
	// no para Strings.

	@GetMapping("/getAvailability")
	public Boolean getAvailability(String matchId) {
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
	@GetMapping("/getAvailability")
	public Boolean getAvailability(String matchId, String userId) {
		return iMatchService.getAvailability(matchId, userId);
	}

	/**
	 * Metodo para agregar un jugador al partido.
	 * 
	 * @param matchId id del partido.
	 * @param userId  id del jugador.
	 */
	@PostMapping("/addPlayer")
	public void addPlayer(String matchId, String userId) {
		iMatchService.addPlayer(matchId, userId);
	}

	/**
	 * Metodo para eliminar un jugador de un partido.
	 * 
	 * @param matchId id del partido.
	 * @param userId  id del jugador
	 */
	@DeleteMapping("/deletePlayer")
	public void deletePlayer(String matchId, String userId) {
		iMatchService.deletePlayer(matchId, userId);
	}

	// No estoy seguro de que sea necesario el update como servicio.
	@PutMapping("/updatePlayers")
	public void updateMatch(String matchId) {
		iMatchService.updateMatch(matchId);
	}

	/**
	 * Metodo para setear la fecha del partido.
	 * 
	 * @param matchId id del partido.
	 * @param date    fecha en formato "yyyy-MM-dd,kk-mm" donde las horas [kk] =
	 *                (1->23)
	 */
	@PostMapping("/setDate")
	public Boolean setDate(String matchId, String date) {
		return iMatchService.setDate(matchId, date);
	}
}
