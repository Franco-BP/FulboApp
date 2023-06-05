package com.fulboapp.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserDTO implements Serializable {

  private static final long serialVersionUID = 6455781916662830542L;

  private Long id;

  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


}