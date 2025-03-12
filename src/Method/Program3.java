package Method;

public class Program3 {
static int a,b;
public static void sum() {
	int c=a+b;
	System.out.println("sum:"+c);
}
public static void main(String[] args) {
	a=20;
	b=30;
	sum();
	a=40;
	b=50;
	sum();
}
}
