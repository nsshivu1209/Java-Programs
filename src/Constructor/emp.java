package Constructor;

public class emp {
int eid;
String name;
double salary;

emp(int eid,String name,double salary){
	this.eid=eid;
	this.name=name;
	this.salary=salary;
	System.out.println(this.eid+" "+this.name+" "+this.salary);
}
public static void main(String[] args) {
	emp e=new emp(1,"ns",25000);
	emp e1=new emp(2,"shivu",30000);
}
}
