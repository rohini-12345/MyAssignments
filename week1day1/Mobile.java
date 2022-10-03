package week1day1;



public class Mobile {
	
	public void makeCall(String mobileModel2,float mobileWeight ) {
		System.out.println("mobile model is"+mobileModel2);
		System.out.println("mobile weight is"+mobileWeight);
	}
	public void sendMsg(boolean fullyCharged,int mobileCost) {
		System.out.println("charged" +fullyCharged);
	System.out.println("mobile cost"+mobileCost);
	}
	
	
		
		
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.makeCall("vivo",255.6f);
		m.sendMsg(true, 30000);
		System.out.println("this is my mobile");
		
		
		
		
		

	}

}
