package com.greenfoxacademy.bankofsimba.Model;

import java.util.ArrayList;
import java.util.List;

public class Accounts {

  private List<BankAccount> accounts;


  public Accounts(){
    accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 2000, "Lion", "Yes"));
    accounts.add(new BankAccount("Nala", 3000, "Lion", "No"));
    accounts.add(new BankAccount("Pumba", 300, "Warthog", "No"));
    accounts.add(new BankAccount("Timon", 1500, "Meerkat", "No"));
  }


  public void addAccount (BankAccount oneaccount){

    accounts.add(oneaccount);
  }

  public List<BankAccount> getAccounts() {
    return accounts;
  }


  public BankAccount getAccount (String name){
    for (BankAccount oneAcc : accounts) {
      if (oneAcc.getName() == name){
        return oneAcc;
      }
    } return null;
  }


}
