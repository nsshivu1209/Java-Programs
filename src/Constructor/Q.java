package Constructor;

public class Q {
	static int i=1;
	public static void m1(){
		System.out.println("method1");
		if(i==3){
			return;
		}i++;
		m1();
	}public static void main(String[] args) {
		m1();
	}
}
