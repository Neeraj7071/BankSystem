package com.bank.globalExceptionHandler;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccountNotFound extends Exception{

	
	public AccountNotFound(String msg) {
		super(msg);
	}

}
