package week1day2assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
	int range=8;
	int firstnum=0;
	int secondnum=1;
	int sum;
	
	System.out.println(firstnum);
	System.out.println(secondnum); 
	for(int i=0;i<=range;i++) {
		sum=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=sum;
		System.out.println(sum); 
		
		
	}

	}
	
	
}