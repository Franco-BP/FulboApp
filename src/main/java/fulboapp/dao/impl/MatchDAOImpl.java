package fulboapp.dao.impl;

import fulboapp.dao.IMatchDAO;
import fulboapp.dto.MatchDTO;
import fulboapp.dto.UserDTO;

import java.util.List;

public class MatchDAOImpl implements IMatchDAO {

	@Override
	public void addMatch(MatchDTO match) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMatch(MatchDTO match) {
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

	@Override
	public void addPlayer(UserDTO userDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean deletePlayer(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addInvitedPlayers(UserDTO userDTO, Integer Amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean deleteInvitedPlayers(UserDTO userDTO, Integer Amount) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
