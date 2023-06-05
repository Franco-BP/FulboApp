package com.fulboapp.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fulboapp.model.User;
import lombok.Data;

@Data
public class MatchDTO implements Serializable {

  private static final long serialVersionUID = 2467856389076854356L;

  private Long id;

  /**
   * No estoy seguro si me conviene guardar el objeto o el id del creador. Si es el objeto, no estoy
   * seguro si conviene la entity o el DTO. ---> A NIVEL DE CODIGO JAVA SE LO ASOCIA A UN OBJETO.
   * LUEGO CUANDO SE MAPEA A LA BD SE PONE EL ID.
   */
  private UserDTO matchCreator;

  private List<User> playersInMatch;

  private Date matchDate;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserDTO getMatchCreator() {
    return matchCreator;
  }

  public void setMatchCreator(UserDTO matchCreator) {
    this.matchCreator = matchCreator;
  }

  public void setPlayersInMatch(ArrayList<User> playersInMatch) {
    this.playersInMatch = playersInMatch;
  }

  public Date getMatchDate() {
    return matchDate;
  }

  public void setMatchDate(Date matchDate) {
    this.matchDate = matchDate;
  }

  /**
   * @return the playersInMatch
   */
  public List<User> getPlayersInMatch() {
    return playersInMatch;
  }

  /**
   * @param playersInMatch the playersInMatch to set
   */
  public void setPlayersInMatch(List<User> playersInMatch) {
    this.playersInMatch = playersInMatch;
  }


}
