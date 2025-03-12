package Array;

import java.util.Arrays;

public class rmvdplctfrmarray {
	public static void main(String[] args) {
		int a[]={1,3,2,2,4,6,6,5};
		//Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]!=a[i+1]){
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for(int i=0;i<=j;i++){
		System.out.print(a[i]+" ");
	}
}
}