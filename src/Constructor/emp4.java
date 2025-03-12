package Constructor;

public class emp4 {


int eid;
double sal;
String designation;

emp4(){
	
	System.out.println("1st constructor");
}
emp4(int eid){
	
	System.out.println("2nd constructor");
}
emp4(int eid,double sal){
	System.out.println("3rd constructor ");
}

public static void main(String[] args) {
	emp4 e2=new emp4();
	emp4 e4=new emp4(2);
	emp4 e5=new emp4(1,25000.0);
}


}
