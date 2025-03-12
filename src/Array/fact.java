package Array;
import java.util.Scanner;
public class fact {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s1.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
			System.out.println(fact);
		}
		
		
	}


