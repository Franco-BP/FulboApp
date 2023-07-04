package com.fulboapp.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MatchDTO implements Serializable {

  private static final long serialVersionUID = 2467856389076854356L;

  private Integer id;

  private UserDTO matchCreator;

  private Date matchDate;

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

}
