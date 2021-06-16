package maps.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class secondsmallest {
	
	public static int getSecondSmallest(Integer[] a, int total){  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(1);  
		return element;  
		}  
		public static void main(String args[]){  
			Integer a[]={1,2,4,3,5,6,10};    
			System.out.println("Second Smallest: "+getSecondSmallest(a,6));  
	
	        }
	        
	        
			
		}


