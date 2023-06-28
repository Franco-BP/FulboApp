package com.fulboapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USUARIO")
@PrimaryKeyJoinColumn(name = "USUARIO_ID")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "USUARIO_ID")
  private Long id;

  @Column(name = "NOMBRE", length = 255)
  private String name;

  @Column(name = "APELLIDO", length = 255)
  private String lastName;

  @Column(name = "SONBRE_NOMBRE", length = 255)
  private String nickName;

  @Column(name = "CIUDAD", length = 255)
  private String location;

  @Column(name = "TELEFONO", length = 255)
  private String phoneNumber;

  @Column(name = "EMAIL", length = 255)
  private String email;

  @Column(name = "CI", length = 10)
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
