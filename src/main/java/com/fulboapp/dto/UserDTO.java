package com.fulboapp.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserDTO implements Serializable {

  private static final long serialVersionUID = -3301003102446571278L;

  private Integer id;

  private String name;

  private String lastName;

  private String nickName;

  private String location;

  private String phoneNumber;

  private String email;

  private Long ci;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getCi() {
    return ci;
  }

  public void setCi(Long ci) {
    this.ci = ci;
  }
}
