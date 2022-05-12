package service;

import java.util.List;

import dao.UserAccountDao;
import dao.UserAccountDaoCollectionImpl;
import model.UserAccountPojo;

public class AccountUserServiceImpl implements AccountUserService{
	
	UserAccountDao userAccountDao;
	

	public AccountUserServiceImpl() {
		userAccountDao = new UserAccountDaoCollectionImpl();
	}

	@Override
	public UserAccountPojo addAccount(UserAccountPojo userAccountPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double depositAmount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserAccountPojo> getAllUserAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
