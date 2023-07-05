package com.fulboapp.model;

import java.io.Serializable;
import lombok.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Match implements Serializable {

	private static final long serialVersionUID = 4567546798123056748L;

	private static final Integer MAX_PLAYERS = 10;

	private Integer id;

	private User matchCreator;
	
	/**
	 * String en formato "yyyy-MM-dd,kk-mm" donde las horas [kk] = (1->23)
	 */
	private Date matchDate;

	private List<User> playersInMatch = new ArrayList<>();
	
	private List<User> invitedPlayers = new ArrayList<>();
	
}
