package Array;

import java.util.Scanner;

public class findelmntarray {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s1.nextInt();
	int a[]=new int [size];
	System.out.println("elements");
	for(int i=0;i<a.length;i++){
		a[i]=s1.nextInt();
		
	}
	boolean flag=true;
	System.out.println("enter the value");
	int value=s1.nextInt();
	for(int i=0;i<a.length;i++ ){
			if(a[i]==value){
				flag=false;
				break;
				
			}
		
	}if(flag==false){
		
	System.out.println("elements is present");
	}
	else
		System.out.println("elements is not present ");
	}
}





