package week1day2assignment;

import java.util.Arrays;

public class MissingElemengtinarray {

	public static void main(String[] args) {
		int[]arr= {1,3,4,5,6,7,8};
		Arrays.sort(arr);
		for(int i=1;i<=arr.length;i++) {
			if(i!=arr[i-1])
			{
				System.out.println(i);
				break;
			}
		}
		
	}

}
