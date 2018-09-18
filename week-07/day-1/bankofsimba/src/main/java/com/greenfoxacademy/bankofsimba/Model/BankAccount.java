package com.greenfoxacademy.bankofsimba.Model;

public class BankAccount {

  private String name;
  private long balance;
  private String animalType;
  private String isking;

  public BankAccount(){}

  public BankAccount(String name, long balance, String animalType, String isking){
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isking = isking;
  }

  public String getName() {
    return name;
  }

  public long getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }


  public String getIsking() {
    return isking;
  }

  public void setIsking(String isking) {
    this.isking = isking;
  }
}
