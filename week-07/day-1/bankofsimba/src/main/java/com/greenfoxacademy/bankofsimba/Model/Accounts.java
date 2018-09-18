package com.greenfoxacademy.bankofsimba.Model;

import java.util.ArrayList;
import java.util.List;

public class Accounts {

  List<BankAccount> accounts = new ArrayList<>();

  public Accounts(){}

  public void addAccount (BankAccount oneaccount){
    accounts.add(oneaccount);
  }

  public BankAccount getAccount (String name){
    for (BankAccount oneAcc : accounts) {
      if (oneAcc.getName() == name){
        return oneAcc;
      }
    } return null;
  }
}
