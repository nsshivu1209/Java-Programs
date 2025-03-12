package Constructor;

public class emp3{

int eid;
double sal;
String designation;
long mobileno;
emp3(int eid,double sal){
	this.eid=eid;
	this.sal=sal;
	System.out.println("1st constructor");
}
emp3(double sal,int eid){
	this.sal=sal;
	this.eid=eid;
	System.out.println("2nd constructor");
}

public static void main(String[] args) {
	emp3 e2=new emp3(1,25000.0);
	emp3 e3=new emp3(25000.0,2);
}

}

