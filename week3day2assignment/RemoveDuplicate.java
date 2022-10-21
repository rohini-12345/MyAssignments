package week3day2assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicate {

	public static void main(String[] args) {
		String s= "PayPal India";
		char[] c=s.toCharArray();
		Set <Character> charset= new LinkedHashSet<Character>();
		Set <Character> dupset= new LinkedHashSet<Character>();
for(int i=0;i<c.length;i++) {
	if(!charset.add(c[i])) {
		dupset.add(c[i]);
	}
}
System.out.println(dupset);
charset.removeAll(dupset);
System.out.println(charset);
	List<Character>list1=new ArrayList<Character>(charset);
	for(int i=0;i<list1.size();i++) {
    	if(list1.get(i)!=' ') {
    		System.out.println(list1.get(i));
    		
    		
    				
    		
}
}
}}