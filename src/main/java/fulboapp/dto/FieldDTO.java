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
}
