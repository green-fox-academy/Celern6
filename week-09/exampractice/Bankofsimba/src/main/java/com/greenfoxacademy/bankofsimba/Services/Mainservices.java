package com.greenfoxacademy.bankofsimba.Services;

import com.greenfoxacademy.bankofsimba.Models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Mainservices {
  List<BankAccount> getAllAccounts();

  void createAccount(BankAccount bankAccount);
}
