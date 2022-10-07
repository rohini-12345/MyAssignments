package week1day2assignment;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] num= {22,78,90,34,20,6};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		
		System.out.println("the second smallest number in the array is"+num[1]);
		

	}

}
