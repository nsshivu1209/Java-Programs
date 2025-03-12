package Constructor;

public class methodrecursion {
public static void m1(){
	m2();
	System.out.println("method 1");
}
public static void m2(){
	System.out.println("method 2");
}
public static void main(String[] args) {
	m1();
}
}
