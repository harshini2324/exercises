package collections.com;

import java.util.Comparator;

public class Account implements Comparator<Account> {
	private int id ;
  private String name ;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int id, String name, double balance) {
	
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	//public int compareTo1(Account b) {  
		//return this.name.compareTo(b.name);
	//}  
public int compareTo(Account e) {
	return this.id-e.id;
}
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}
@Override
public int compare(Account o1, Account o2) {
	// TODO Auto-generated method stub
	return 0;
}
}




