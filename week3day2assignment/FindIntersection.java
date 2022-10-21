package week3day2assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List<Integer>list1 = new ArrayList<Integer>();
		List<Integer>list2=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			list1.add(a[i]);
		}
		for(int j=0;j<b.length;j++) {
			list2.add(b[j]);
		}
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("Intersection values are");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(list1.get(i)==list2.get(j)) {
				System.out.println(+list1.get(i));
				}
			}
		}

	}

}
