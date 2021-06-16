package collections.com;

//import java.awt.List;
import java.util.ArrayList;
//import java.util.SortedMap;
//import java.util.SortedSet;
//import java.util.TreeSet;
import java.util.Collections;

public class User {
	
	public static void main(String[] args) {
		 ArrayList<Account> list=new ArrayList<>();
  list.add(new Account(1,"harshini",2000));
          list.add(new Account(3,"vangara",2500));
          list.add(new Account(2,"arun",1500));
          list.add(new Account(4,"shashi",6000));
          list.add(new Account(5,"pappa",4500));
          System.out.println("Unsorted list-------");
          for(Account cd:list)
          {
        	  System.out.println(+cd.getId()+" "+cd.getName()+" "+cd.getBalance());
          }
          System.out.println("Sorted list by Balance--------");
          Collections.sort(list, new BalanceComparator());
          System.out.println(list);
          
          System.out.println("Sorted list by Name--------");
          Collections.sort(list, new NameComparator());
          System.out.println(list);
	}

	


	

}
