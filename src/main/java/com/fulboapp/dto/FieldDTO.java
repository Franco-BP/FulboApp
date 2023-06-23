package com.fulboapp.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class FieldDTO implements Serializable {

  private static final long serialVersionUID = 6436534623514231341L;

  private Long id;

  private String location;

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

}
