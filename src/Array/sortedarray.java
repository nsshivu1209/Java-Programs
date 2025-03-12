package Array;

import java.util.Scanner;

public class sortedarray {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter any number");
	int size=s1.nextInt();
	int a[]=new int [size];
	System.out.println("elements");
	for(int i=0;i<a.length;i++){
		a[i]=s1.nextInt();
		
	}
	for(int i=0;i<a.length;i++ ){
		for(int j=0;j<a.length;j++){
			if(a[i]>a[j]){
				int tem=a[i];
				a[i]=a[j];
				a[j]=tem;
			}
		}
	}
	System.out.println("after sorting");
	for(int  i=0;i<a.length;i++){
		System.out.println(a[i]+" ");
	}
}
}
