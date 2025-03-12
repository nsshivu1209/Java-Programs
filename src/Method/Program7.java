package Method;

import java.util.Scanner;

public class Program7 {
	

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	int sum=0;

	for(int i=1;i<=a;i++){
	if(isprime(i)==true){
		sum=sum+i;
		}
	}	
	
System.out.println("sum of prime no is:"+sum);

}

public static boolean isprime(int num){
	if(num==1)
		return false;
	for(int i=2; i<num;i++){
		if(num%i==0)
		
		return false;
	
	}
	return true;

	}
}




