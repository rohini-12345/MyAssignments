package week3day2assignment;


import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] number= {5,6,1,3,2,4,8,10,9};
		
		Set<Integer> set1=new TreeSet<Integer>();
for(int i=0;i<number.length;i++) {
	set1.add(number[i]);
	
}
System.out.println(set1);
for(int j=1;j<number.length-1;j++) {

	 if(!set1.contains(j)) {
		 System.out.println("the missing number is " +j);
	 }	 }
}
}