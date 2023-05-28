package fulboapp.model;

import java.io.Serializable;
import lombok.Data;
import java.util.ArrayList;

@Data
public class Match implements Serializable {

	private static final long serialVersionUID = 4567546798123056748L;

	private static final Integer MAX_PLAYERS = 10;

	private Long id;

	/**
	 * No estoy seguro si me conviene guardar el objeto o el id del creador.
	 */
	private User matchCreator;

	private ArrayList<User> playersInMatch = new ArrayList<>();
	
	/**
	 * String en formato "yyyy-MM-dd,kk-mm" donde las horas [kk] = (1->23)
	 */
	private String matchDate;
}
