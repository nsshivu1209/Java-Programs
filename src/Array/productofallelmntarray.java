package Array;

public class productofallelmntarray {
public static int method(int b[]){
	int product=1;
	for(int i=0;i<b.length;i++){
		product=product*b[i];
	}
       return product;
}
public static void main(String[] args) {
	int a[]={1,2,3,4,5};
	int product=method(a);
System.out.println(product);
}
}
