package Array;

public class nullpointerexception {
public static void main(String[] args) {
	int a[]=null;
	int a1[]=new int[5];
	for(int i=0;i<a1.length;i++){
		System.out.println(a1[i]);
	}
	

   System.out.println(a[0]);
}
}