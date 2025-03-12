package Array;
import java.util.Scanner;
public class maxnumarray {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s1.nextInt();
int a[]=new int[size];
System.out.println("enter the elements");
for(int i=0;i<a.length;i++){
	a[i]=s1.nextInt();
}
int max=a[0];
for(int i=1;i<a.length;i++){
if(a[i]>max){
	
	max=a[i];
}
}
System.out.println("largest element is :"+max);
}
}

