package com.fulboapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Company implements Serializable {

  private static final long serialVersionUID = 2564796854326751275L;

  private Long id;

  private String companyName;

  private String phoneNumber;

  private String email;

  private List<Field> fieldsInCompany = new ArrayList<Field>();
}
