package Method;

public class Program10 {

public static void method(int a,double b){
	System.out.println("1st method ");
}
public static void method(double a,int b,double c){
	System.out.println("2nd method ");

}
public static void main(String[] args) {
	method(10,10.2);
	method(10.7,18,12.9);
}

}
