package com.bank.service;

import javax.security.auth.login.AccountException;

import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUser;
import com.bank.entity.Transaction;
import com.bank.globalExceptionHandler.AccountNotFound;

public interface BankUserService {
	BankUser saveBankUser(BankUserDTO d1);
	Transaction creaditAmmount(String accNo,int money) throws AccountException;
	Transaction debitAmmount(String accNo,int money)throws AccountException;
}
