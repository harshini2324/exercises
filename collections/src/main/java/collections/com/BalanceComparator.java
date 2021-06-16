package collections.com;

import java.util.Comparator;

public class BalanceComparator  implements Comparator<Account> {

	public int compare(Account c1, Account c2) {
		// TODO Auto-generated method stub
		return (int) (c1.getBalance()-c2.getBalance());
	}
 

}
