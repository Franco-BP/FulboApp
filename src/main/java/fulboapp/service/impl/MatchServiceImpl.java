package fulboapp.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fulboapp.dao.IMatchDAO;
import fulboapp.dao.IUserDAO;
import fulboapp.dto.MatchDTO;
import fulboapp.dto.UserDTO;
import fulboapp.service.IMatchService;

@Service
public class MatchServiceImpl implements IMatchService {

	@Autowired
	IMatchDAO iMatchDAO;
	
	@Autowired
	IUserDAO iUserDAO;

	private static final Integer MAX_PLAYERS = 10;
	
	/**
	 * Metodo interno para chequear si un partido tiene cupos.
	 * @param matchDTO partido a chequear.
	 * @return True si tiene cupos.
	 */
	private Boolean checkAvailability(MatchDTO matchDTO, Integer amountToCheck) {
		Integer amountOfPlayers = matchDTO.getPlayersInMatch().size() + matchDTO.getInvitedPlayers().size();
		return amountOfPlayers + amountToCheck <= MAX_PLAYERS;
	}
	
	@Override
	public MatchDTO getMatch(Long matchId) {
		return iMatchDAO.findMatch(matchId);
	}
	
	@Override
	public void deleteMatch(Long matchId) {
		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
		if (matchDTO != null) {
			iMatchDAO.deleteMatch(matchDTO);
		}
	}
	
	@Override
	public void updateMatch(Long matchId) {
		iMatchDAO.updateMatch(iMatchDAO.findMatch(matchId));
	}
	
	@Override
	public List<MatchDTO> getListAllMatches(Boolean avoidFulls) {
		return iMatchDAO.findAll(avoidFulls);
	}
	
	@Override
	public void addPlayer(Long matchId, Long userId) {
		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
		UserDTO userDTO = iUserDAO.findUser(userId);
		
		if (this.checkAvailability(matchDTO, 1) & !matchDTO.getPlayersInMatch().contains(userDTO)) {
			iMatchDAO.addPlayer(userDTO);
		}
	}
	
	@Override
	public void deletePlayer(Long matchId, Long userId) {
		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
		UserDTO userDTO = iUserDAO.findUser(userId);
		
		if (matchDTO.getPlayersInMatch().contains(userDTO)) {
			iMatchDAO.deletePlayer(userDTO);
		}
	}
	
	@Override
	public void addInvitedPlayers(Long matchId, Long userId, Integer amount) {
		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
		UserDTO userDTO = iUserDAO.findUser(userId);
		
		if (this.checkAvailability(matchDTO, amount)) {
			iMatchDAO.addInvitedPlayers(userDTO, amount);
		}
	}
	
	@Override
	public void deleteInvitedPlayers(Long matchId, Long userId, Integer amount) {
		
		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
		UserDTO userDTO = iUserDAO.findUser(userId);
	
		if (matchDTO.getInvitedPlayers().contains(userDTO)) {
			iMatchDAO.deleteInvitedPlayers(userDTO, amount);
		}
	}

	@Override
	public Boolean getAvailability(Long matchId) {
		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
		
		if (this.checkAvailability(matchDTO, 1)) {
			return true;
		} else {
			return null;
		}
	}
	
	@Override
	public Boolean getAvailabilityForUser(Long matchId, Long userId) {
		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
		UserDTO userDTO = iUserDAO.findUser(userId);
		
		if (!this.checkAvailability(matchDTO, 1)) {
			return null;
		} else if (matchDTO.getPlayersInMatch().contains(userDTO)) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Metodo para setear la fecha del partido.
	 * @param matchId id Long del partido.
	 * @param date fecha en formato "yyyy-MM-dd,kk-mm" donde las horas [kk] = (1->23) 
	 * @return True si se pudo setear bien.
	 */
	@Override
	public Boolean setDate(Long matchId, Date date) {
		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
		
		//if (date.getYear())
		////////////////////////////////////////////////////////////
			
		matchDTO.setMatchDate(date);
		iMatchDAO.updateMatch(matchDTO);
		return null;
	}

}
