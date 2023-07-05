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
	  // TODO Auto-generated method stub
	  return null;
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
  public MatchDTO findMatch(Integer matchID) {
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
