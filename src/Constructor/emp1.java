package Constructor;

public class emp1 {
static int eid;

emp1(int eid){
	this.eid=eid;
	System.out.println(this.eid);
}
public static void main(String[] args) {
	emp1 e1=new emp1(1);
}
}
