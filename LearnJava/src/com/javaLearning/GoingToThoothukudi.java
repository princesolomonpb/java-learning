package com.javaLearning;

public class GoingToThoothukudi {
String bike;
String no;
GoingToThoothukudi(String bike1,String string){
	bike=bike1;
	no=string;
}
public String goingandreturn() {
	System.out.println("my bike is "+bike+"my no is"+no);
	return bike;
}
	public static void main(String[] args) {
		GoingToThoothukudi gt =new GoingToThoothukudi("fz", "9996");
		String goingandreturn = gt.goingandreturn();
		System.out.println(goingandreturn);
	}

}
