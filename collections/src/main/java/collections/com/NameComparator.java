package collections.com;

import java.util.Comparator;

public class NameComparator implements Comparator<Account> {

	

	@Override
	public int compare(Account a, Account a1) {
		// TODO Auto-generated method stub
		return a.getName().compareTo(a1.getName());
	}

}
