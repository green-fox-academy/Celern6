package com.greenfoxacademy.bankofsimba.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private long balance;
  private String animaltype;


  public BankAccount() {
  }

  public BankAccount(String name, long balance, String animaltypa) {
    this.name = name;
    this.balance = balance;
    this.animaltype = animaltypa;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public String getAnimaltype() {
    return animaltype;
  }

  public void setAnimaltype(String animaltypa) {
    this.animaltype = animaltypa;
  }
}
