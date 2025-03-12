package Array;
import java.util.Scanner;
public class perfectnumber {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number");
		int number=s1.nextInt();
		int temp=number;
		int sum=0;
for(int i=1;i<number;i++){
	if(number%i==0){
		//System.out.println(i);
		sum=sum+i;
	}
}
//	System.out.println(sum);
		if(temp==sum){
			System.out.println("perfect");
		}
	
else{
	System.out.println("not");
}
	}

}

