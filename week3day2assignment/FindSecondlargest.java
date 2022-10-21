package week3day2assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondlargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set1=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			set1.add(data[i]);
		}
		System.out.println(set1);
		//converted Set into List
		List<Integer>list1= new ArrayList<Integer>(set1);
		int size=list1.size();
		System.out.println("second largest number is " +list1.get(size-2));
				
	}

}
