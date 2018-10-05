package com.greenfoxacademy.bankofsimba.Services;


import com.greenfoxacademy.bankofsimba.Models.BankAccount;
import com.greenfoxacademy.bankofsimba.Repositories.Accountrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mainservicesimpl implements Mainservices{

  Accountrepository accountrepository;

  @Autowired
  public Mainservicesimpl(Accountrepository accountrepository) {
    this.accountrepository = accountrepository;
  }

  @Override
  public List<BankAccount> getAllAccounts() {
    return accountrepository.findAll();
  }

  @Override
  public void createAccount(BankAccount bankAccount) {
    accountrepository.save(bankAccount);
  }
}
