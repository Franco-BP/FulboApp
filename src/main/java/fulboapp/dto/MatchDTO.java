package fulboapp.dto;

import java.io.Serializable;
import java.util.ArrayList;

import fulboapp.model.User;
import lombok.Data;

@Data
public class MatchDTO implements Serializable {

	private static final long serialVersionUID = 2467856389076854356L;

	private Long id;

	/**
	 * No estoy seguro si me conviene guardar el objeto o el id del creador.
	 * Si es el objeto, no estoy seguro si conviene la entity o el DTO.
	 */
	private User matchCreator;

	private ArrayList<User> playersInMatch = new ArrayList<>();

	private String matchDate;
}
