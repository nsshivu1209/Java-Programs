package Calculator;

public class calculation {
public static void addition(int...a){
	int sum=0;
	for(int i=0;i<a.length;i++){
		sum+=a[i];
	}
	System.out.println(sum);
}
public static void multiplication(int...a){
	int mul=1;
	for(int i=0;i<a.length;i++){
		mul*=a[i];
	}
	System.out.println(mul);
}

}
