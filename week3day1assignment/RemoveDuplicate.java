package week3day1assignment;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		int count =0;
		String replace="";
		String Dup=" ";
	
String[] split = text.split(" ");
		
		System.out.println(Arrays.toString(split));
		
		 for(int i=0;i<split.length;i++) {
			 
			 for(int j=i+1;j<split.length;j++) {
				 
				 if(split[i].equals(split[j])){ 
					 Dup=split[i];
					 count++;
			 }
				 }
			 }
		
		 if(count>1) {
			 replace = text.replace("java", "");
		}
		 
		 System.out.println("The duplicate word is "+Dup);
		 
		 System.out.println(replace);
		

}


}
