package service;

import java.util.List;

import model.UserAccountPojo;

public interface AccountUserService {
	
UserAccountPojo addAccount(UserAccountPojo userAccountPojo);
	
	public void checkBalance();
	
	public void deposit(double depositAmount);
	
	public double withdraw(double withdrawAmount);
	
	List<UserAccountPojo> getAllUserAccounts();

}
