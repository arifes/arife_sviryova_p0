package model;

public class UserAccountPojo {
	private String userID;
	private String bankAccountType;
	private int bankAccountNumber;
	private String userName;
	private int password;
	private double balance;
		
	public UserAccountPojo() {
		super();
	}


	public UserAccountPojo(String userID, String bankAccountType, int bankAccountNumber, String userName, int password, double balance) {
		super();
		this.userID = userID;
		this.bankAccountType = bankAccountType;
		this.bankAccountNumber = bankAccountNumber;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getBankAccountType() {
		return bankAccountType;
	}


	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}


	public int getBankAccountNumber() {
		return bankAccountNumber;
	}


	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "UserAccountPojo [userID=" + userID + ", bankAccountType=" + bankAccountType + ", bankAccountNumber="
				+ bankAccountNumber + ", userName=" + userName + ", password=" + password + ", balance=" + balance
				+ "]";
	}
	
	

	

	


}
