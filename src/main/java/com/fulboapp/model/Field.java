package com.fulboapp.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class Field implements Serializable {

  private static final long serialVersionUID = 1564378723654987865L;

  private Long id;

  private String location;

}
