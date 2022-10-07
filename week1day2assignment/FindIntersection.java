package week1day2assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,5,8,15,11};
		int b[] = {4,2,11,17,};
		int arr1 = a.length;
		int arr2 = b.length;
		for(int i=0;i<arr1;i++) {
			for(int j=0; j<arr2;j++) {
				if(a[i]==b[j]) {
					System.out.println("The intersection of array a[] and b[] are "+a[i]);
				}
			}
		}
	}

}
