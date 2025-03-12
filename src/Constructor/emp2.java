package Constructor;

public class emp2 {
int eid;
double sal;
String designation;
emp2(int eid){
	this.eid=eid;
}
emp2(double sal){
	this.sal=sal;
}
emp2(String designation){
	this.designation=designation;
}
public static void main(String[] args) {
	emp2 e2=new emp2(1);
	emp2 e3=new emp2("TE");{
	System.out.println(e2.eid);
	System.out.println(e3.designation);
}
}
}
