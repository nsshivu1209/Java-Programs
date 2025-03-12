package Constructor;

public class bike {
	String brand;
	String name;
	String colour;
	double price;
	bike(String b,String n,String c,double d){
		brand=b;
		name=n;
		colour=c;
		price=d;
		System.out.println(b+" "+n+" "+c+" "+d);
	}
	public static void main(String[] args) {
		bike b=new bike("royal enfield","intercepter650","matte silver",380000);
		bike b1=new bike("tvs","apache 310","orange",310000);
	}
}

