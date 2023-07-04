package com.fulboapp.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fulboapp.dto.MatchDTO;
import com.fulboapp.service.IMatchService;

@RestController
public class MatchController {

  @Autowired
  private IMatchService iMatchService;


  @GetMapping("/getAll")
  public List<MatchDTO> getAll() {
    return iMatchService.getAll();
  }



  // No se que se pone en el GetMapping. Por lo que encontre,
  // es algo vinculado a la url donde se ubica el metodo.

  // Por lo que encontre, el RequestBody toma los datos del Json. No se si
  // es necesario usarlo en Strings, pero supongo que Long y Boolean si
  // pues no son primitivas.

  // No se si RequestBody es necesario ponerlo a todos los parametros, no se si es
  // especifico de la variable o del ingreso (osea: ponerlo 1 o 2 veces si hay 2 parametros).

  @GetMapping("/getAvailability")
  public Boolean getAvailability(@RequestBody MatchDTO matchDTO) {
    return iMatchService.getAvailability(matchDTO);
  }

  @GetMapping("/hello")
  public String hell() {
    return "HOLA API";
  }

  /**
   * Metodo para chequear la disponibilidad de cupos para un jugador particular.
   * 
   * @param matchId id del partido a chequear.
   * @param userId id del jugador a chequear.
   * @return null si esta lleno, false si el jugador esta repetido y true si tiene cupos.
   */
  @GetMapping("/getAvailability2")
  public Boolean getAvailability(@RequestBody MatchDTO matchDTO, @RequestParam Long userId) {
    return iMatchService.getAvailability(matchDTO, userId);
  }

  /**
   * Metodo para obtener todos los partidos.
   * 
   * @param avoidFulls - True si se desea evitar los partidos ya completos.
   * @return List<MatchDTO> - Lista de los partidos encontrados.
   */
  @GetMapping("/getListAllMatches")
  public List<MatchDTO> getListAllMatches(@RequestParam Boolean avoidFulls) {
    return iMatchService.getListAllMatches(avoidFulls);
  }

  /**
   * Metodo para obtener un partido particular.
   * 
   * @param matchId - Long con el id del partido.
   * @return MatchDTO o null si no hay coincidencias.
   */
  public MatchDTO getMatch(@RequestParam Integer id) {
    return iMatchService.findMatch(id);
  }

  public void deleteMatch(@RequestBody MatchDTO matchDTO) {
    iMatchService.deleteMatch(matchDTO);
  }

  /**
   * Metodo para agregar un jugador al partido.
   * 
   * @param matchId id del partido.
   * @param userId id del jugador.
   */
  @PostMapping("/addPlayer")
  public void addPlayer(@RequestBody MatchDTO matchDTO, @RequestParam Long userId) {
    iMatchService.addPlayer(matchDTO, userId);
  }

  /**
   * Metodo para eliminar un jugador de un partido.
   * 
   * @param matchId id del partido.
   * @param userId id del jugador
   */
  @DeleteMapping("/deletePlayer")
  public void deletePlayer(@RequestBody MatchDTO matchDTO, @RequestParam Long userId) {
    iMatchService.deletePlayer(matchDTO, userId);
  }

  // No estoy seguro de que sea necesario el update como servicio.
  @PutMapping("/updatePlayers")
  public void updateMatch(@RequestBody MatchDTO matchDTO) {
    iMatchService.updateMatch(matchDTO);
  }

  /**
   * Metodo para setear la fecha del partido.
   * 
   * @param matchId id del partido.
   * @param date fecha en formato "yyyy-MM-dd,kk-mm" donde las horas [kk] = (1->23)
   */
  @PostMapping("/setDate")
  public Boolean setDate(@RequestBody MatchDTO matchDTO, @RequestParam Date date) {
    return iMatchService.setDate(matchDTO, date);
  }
}
