package com.fulboapp.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import lombok.Data;

@Data
public class MatchDTO implements Serializable {

  private static final long serialVersionUID = 2467856389076854356L;

  /**
   * No estoy seguro si me conviene guardar el objeto o el id del creador. Si es el objeto, no estoy
   * seguro si conviene la entity o el DTO. ---> A NIVEL DE CODIGO JAVA SE LO ASOCIA A UN OBJETO.
   * LUEGO CUANDO SE MAPEA A LA BD SE PONE EL ID.
   */
  private Long id;

  private UserDTO matchCreator;

  private Date matchDate;

  private ArrayList<UserDTO> playersInMatch = new ArrayList<>();

  private ArrayList<UserDTO> invitedPlayers = new ArrayList<>();

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

  public Date getMatchDate() {
    return matchDate;
  }

  public void setMatchDate(Date matchDate) {
    this.matchDate = matchDate;
  }

  public ArrayList<UserDTO> getPlayersInMatch() {
    return playersInMatch;
  }

  public void setPlayersInMatch(ArrayList<UserDTO> playersInMatch) {
    this.playersInMatch = playersInMatch;
  }

  public ArrayList<UserDTO> getInvitedPlayers() {
    return invitedPlayers;
  }

  public void setInvitedPlayers(ArrayList<UserDTO> invitedPlayers) {
    this.invitedPlayers = invitedPlayers;
  }

}
