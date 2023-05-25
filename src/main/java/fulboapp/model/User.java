package fulboapp.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 3719638096558536431L;

  private Long id;

  private String name;

}
