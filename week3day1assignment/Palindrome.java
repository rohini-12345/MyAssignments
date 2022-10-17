package week3day1assignment;

public class Palindrome {

	public static void main(String[] args) {
		String S="madam";
		String rev="";
		char[] ch=S.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ ch[i];
			
			}
		System.out.println("revered string values is"+rev);
		boolean equals=S.equals(rev);
		System.out.println("The given string is a palindrome  "+equals);
		}
}
