package week3day2assignment;

import java.util.HashSet;
import java.util.Set;

public class printUniquecharacter {

	public static void main(String[] args) {
		String A="Rohini";
		char[] name = A.toCharArray();
char duplicate=0;
Set<Character>set=new HashSet<Character>();
for(int i=0;i<name.length;i++) {
	if(!set.add(name[i])) {
		duplicate=name[i];
		set.remove(duplicate);
	}
}
System.out.println("The unique characters are "+set);

	}

}
