package maps.com;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class sortedmap {

	
	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String,Integer>();
		map.put("harshini", 2);
		map.put("sowmya", 4);
		map.put("shashi", 1);
		map.put("pappa", 3);
		List<Entry<String,Integer>>list=new LinkedList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(list,new Comparator<Entry<String,Integer>>() {
			

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});

			
			
		
		for(Entry<String,Integer> s : list )
		{
			System.out.println(s);
		}
	}

}
