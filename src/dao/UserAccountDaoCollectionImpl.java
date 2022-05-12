package dao;

import java.util.ArrayList;
import java.util.List;

import model.UserAccountPojo;

public class UserAccountDaoCollectionImpl implements UserAccountDao {
	
	List<UserAccountPojo> allUserAccounts = new ArrayList<UserAccountPojo>();
	
	public UserAccountDaoCollectionImpl() {
		UserAccountPojo user1 = new UserAccountPojo("JohnS", "John Smith",01, "Checking", 1234, 1000.00);
		allUserAccounts.add(user1);
	}

	@Override
	public UserAccountPojo addAccount(UserAccountPojo userAccountPojo) {
		int newBankAccountNumber = allUserAccounts.get(allUserAccounts.size()-1).getBankAccountNumber() + 1;
		userAccountPojo.setBankAccountNumber(newBankAccountNumber);
		allUserAccounts.add(userAccountPojo);
		return userAccountPojo;
	}

	@Override
	public double checkBalance() {
		return this.balance;			
	}

	@Override
	public void deposit(double depositAmount) {
		this.balance = balance + depositAmount;
		
	}

	@Override
	public double withdraw(double withdrawAmount) {
		this.balance = this.balance - withdrawAmount;
		return withdrawAmount;
	}

	@Override
	public List<UserAccountPojo> getAllUserAccounts() {
		return allUserAccounts;
	
	}

/*	@Override
	public UserAccountPojo chooseAccount(int bankAccountNumber) {
		UserAccountPojo foundBankAccount = null;
		for(int i=0; i<allUserAccounts.size(); i++) {
			if(allUserAccounts.get(i).getBankAccountNumber()== bankAccountNumber) {
				foundBankAccount = allUserAccounts.get(i); // When match found, assign the found reference variable to foundBankAccount
				break;
	
		    } 
		}
		return foundBankAccount;
			
	}
	*/
	}
