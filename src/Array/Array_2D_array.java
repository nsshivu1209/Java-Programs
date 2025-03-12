package Array;

import java.util.Scanner;

public class Array_2D_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
	    System.out.println("enter rows");
	    int rows=sc.nextInt();
	    System.out.println("enter column");
	    int column=sc.nextInt();
	    int a[][]=new int [rows][column];
	    for(int i=0;i<a.length;i++) {
	    	for(int j=0;j<a[i].length;j++) {
	    		a[i][j]=sc.nextInt();
	    	}
	    }
	    for(int i=0;i<a.length;i++) {
	    	for(int j=0;j<a[i].length;j++) {
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}

}
