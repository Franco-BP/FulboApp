package fulboapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fulboapp.dao.IMatchDAO;
import fulboapp.dao.IUserDAO;
import fulboapp.dao.impl.UserDAOImpl;
import fulboapp.dto.MatchDTO;
import fulboapp.dto.UserDTO;
import fulboapp.service.IMatchService;

@Service
public class MatchServiceImpl implements IMatchService {

	@Autowired
	IMatchDAO iMatchDAO;

	private static final Integer MAX_PLAYERS = 10;

	@Override
	public Boolean getAvailability(String matchId) {
//		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
//		
//		if (matchDTO.playersInMatch.size() >= MAX_PLAYERS) {
//			return null;
//		} else {
//			return true;
//		}
		
		return null; /********** Eliminar **********/
	}

	/** 
	 * No se como hacer para usar los getter/setter de Lombok.
	 * Tampoco se si deberia tener un AutoWired de IUserDAO si lo voy a estar usando.
	 */
	
	@Override
	public Boolean getAvailability(String matchId, String userId) {
//		IUserDAO iUserDAO = new UserDAOImpl();
//		
//		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
//		UserDTO userDTO = iUserDAO.findUser(userId);
//		
//		if (matchDTO.playersInMatch.size() >= MAX_PLAYERS) {
//			return null;
//		} else if (matchDTO.playersInMatch.contains(userDTO)) {
//			return false;
//		} else {
//			return true;
//		}
		
		return null; /********* Eliminar *********/
	}
	
	@Override
	public List<MatchDTO> getListAllMatches(Boolean avoidFulls) {
		return iMatchDAO.findAll(avoidFulls);
	}
	
	@Override
	public MatchDTO getMatch(String matchId) {
		return iMatchDAO.findMatch(matchId);
	}
	
	@Override
	public void deleteMatch(String matchId) {
		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
		if (matchDTO != null) {
			iMatchDAO.removeMatch(matchDTO);
		}
	}
	
	@Override
	public void updateMatch(String matchId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPlayer(String matchId, String userId) {
//		IUserDAO iUserDAO = new UserDAOImpl();
//		
//		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
//		UserDTO userDTO = iUserDAO.findUser(userId);
//		
//		if (matchDTO.playersInMatch.size() < MAX_PLAYERS & !matchDTO.playersInMatch.contains(user) {
//			matchDTO.playersInMatch.add(userDTO);
//			iMatchDAO.updateMatch(matchDTO);
//		}
	}

	@Override
	public void deletePlayer(String matchId, String userId) {
// 		IUserDAO iUserDAO = new UserDAOImpl();
//		
//		MatchDTO matchDTO = iMatchDAO.findMatch(matchId);
//		UserDTO userDTO = iUserDAO.findUser(userId);
//		
//		matchDTO.playersInMatch.remove(userDTO);
	}

	@Override
	public Boolean setDate(String matchId, String date) {
		// TODO Auto-generated method stub
		return null;
	}
}
