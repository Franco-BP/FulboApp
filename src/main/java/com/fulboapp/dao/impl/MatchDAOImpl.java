package com.fulboapp.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.fulboapp.dao.IMatchDAO;
import com.fulboapp.dto.MatchDTO;
import com.fulboapp.dto.UserDTO;

@Repository
public class MatchDAOImpl implements IMatchDAO {

  @Override
  public List<MatchDTO> getAll() {
    List<MatchDTO> list = new ArrayList<MatchDTO>();
    UserDTO userDTO = new UserDTO();
    userDTO.setId(Long.valueOf(1));
    userDTO.setName("Franco");

    MatchDTO matchDTO = new MatchDTO();
    matchDTO.setId(Long.valueOf(1));
    matchDTO.setMatchCreator(userDTO);
    matchDTO.setMatchDate(new Date());

    MatchDTO matchDTO2 = new MatchDTO();
    matchDTO2.setId(Long.valueOf(2));
    matchDTO2.setMatchCreator(userDTO);
    matchDTO2.setMatchDate(new Date());

    MatchDTO matchDTO3 = new MatchDTO();
    matchDTO3.setId(Long.valueOf(3));
    matchDTO3.setMatchCreator(userDTO);
    matchDTO3.setMatchDate(new Date());

    list.add(matchDTO);
    list.add(matchDTO2);
    list.add(matchDTO3);
    return list;
  }

  @Override
  public void addMatch(MatchDTO match) {
    // TODO Auto-generated method stub

  }

  @Override
  public void removeMatch(MatchDTO match) {
    // TODO Auto-generated method stub

  }

  @Override
  public void updateMatch(MatchDTO match) {
    // TODO Auto-generated method stub

  }

  @Override
  public MatchDTO findMatch(Long matchID) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<MatchDTO> findAll(boolean avoidFulls) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<MatchDTO> findMatchesByDate(String date, boolean avoidFulls) {
    // TODO Auto-generated method stub
    return null;
  }

}
