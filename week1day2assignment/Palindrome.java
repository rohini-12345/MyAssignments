package week1day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =34343;
		int rev= 0;
		for(int i = num ;i>0;i=i/10){
			int reminder = i%10;
			rev = rev *10 + reminder;
		}
		System.out.println(rev);
		if(num == rev) {
			System.out.println(rev+" the given number is a palindrome");
		}else {
			System.out.println(rev+" the given number is not a palindrome");
		}
	}

}
