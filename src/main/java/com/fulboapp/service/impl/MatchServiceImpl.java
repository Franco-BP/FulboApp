package com.fulboapp.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fulboapp.dao.IMatchDAO;
import com.fulboapp.dto.MatchDTO;
import com.fulboapp.service.IMatchService;

@Service
public class MatchServiceImpl implements IMatchService {

  @Autowired
  private IMatchDAO iMatchDAO;

  private static final Integer MAX_PLAYERS = 10;
  
  public List<MatchDTO> getAll(){
    return iMatchDAO.getAll();
  }

  @Override
  public Boolean getAvailability(Long matchId) {
    // MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
    //
    // if (matchDTO.playersInMatch.size() >= MAX_PLAYERS) {
    // return null;
    // } else {
    // return true;
    // }

    return null; /********** Eliminar **********/
  }

  

  @Override
  public Boolean getAvailability(Long matchId, Long userId) {
    // IUserDAO iUserDAO = new UserDAOImpl();
    //
    // MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
    // UserDTO userDTO = iUserDAO.findUser(userId);
    //
    // if (matchDTO.playersInMatch.size() >= MAX_PLAYERS) {
    // return null;
    // } else if (matchDTO.playersInMatch.contains(userDTO)) {
    // return false;
    // } else {
    // return true;
    // }

    return null; /********* Eliminar *********/
  }

  @Override
  public List<MatchDTO> getListAllMatches(Boolean avoidFulls) {
    return iMatchDAO.findAll(avoidFulls);
  }

  @Override
  public MatchDTO getMatch(Long matchId) {
    return iMatchDAO.findMatch(matchId);
  }

  @Override
  public void deleteMatch(Long matchId) {
    MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
    if (matchDTO != null) {
      iMatchDAO.removeMatch(matchDTO);
    }
  }

  @Override
  public void updateMatch(Long matchId) {
    // TODO Auto-generated method stub

  }

  @Override
  public void addPlayer(Long matchId, Long userId) {
    // IUserDAO iUserDAO = new UserDAOImpl();
    //
    // MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
    // UserDTO userDTO = iUserDAO.findUser(userId);
    //
    // if (matchDTO.playersInMatch.size() < MAX_PLAYERS & !matchDTO.playersInMatch.contains(user) {
    // matchDTO.playersInMatch.add(userDTO);
    // iMatchDAO.updateMatch(matchDTO);
    // }
  }

  @Override
  public void deletePlayer(Long matchId, Long userId) {
    // IUserDAO iUserDAO = new UserDAOImpl();
    //
    // MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
    // UserDTO userDTO = iUserDAO.findUser(userId);
    //
    // matchDTO.playersInMatch.remove(userDTO);
  }

  @Override
  public Boolean setDate(Long matchId, Date date) {
    // TODO Auto-generated method stub
    return null;
  }
}
