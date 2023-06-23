package com.fulboapp.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class User implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 3719638096558536431L;

  private Long id;

  private String name;

  private String lastName;

  private String nickName;

  private String location;

  private String phoneNumber;

  private String email;

  private Long ic;

  private Map<Long, Match> subscribedMatches = new HashMap<Long, Match>();

  public String getFullName() {
    return this.name + " " + this.lastName;
  }

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

  public Map<Long, Match> getSubscribedMatches() {
    return subscribedMatches;
  }

  public void setSubscribedMatches(Map<Long, Match> subscribedMatches) {
    this.subscribedMatches = subscribedMatches;
  }

  public Long getIc() {
    return ic;
  }

  public void setIc(Long ic) {
    this.ic = ic;
  }



}
