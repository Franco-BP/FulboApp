package fulboapp.dto;

import java.io.Serializable;
import lombok.Data;
import java.util.Map;

@Data
public class FieldDTO implements Serializable {

	private static final long serialVersionUID = 6436534623514231341L;

	private Long id;

	private String location;

	private Map<String, Map<String, Boolean>> calendar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Map<String, Map<String, Boolean>> getCalendar() {
		return calendar;
	}

	public void setCalendar(Map<String, Map<String, Boolean>> calendar) {
		this.calendar = calendar;
	}
}
