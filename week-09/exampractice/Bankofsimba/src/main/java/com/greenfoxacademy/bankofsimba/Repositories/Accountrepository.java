package com.greenfoxacademy.bankofsimba.Repositories;

import com.greenfoxacademy.bankofsimba.Models.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Accountrepository extends CrudRepository<BankAccount, Long> {

  List<BankAccount> findAll();

}
