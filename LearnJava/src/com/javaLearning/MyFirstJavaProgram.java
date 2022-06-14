package com.javaLearning;

public class MyFirstJavaProgram {
String name="prince";
int age=25;
public void personaldetails() {
	System.out.println("my name is"+name+"\n"+"my age is"+age);
}
	public static void main(String[] args) {
		MyFirstJavaProgram pd=new MyFirstJavaProgram();
		pd.personaldetails();
	}

}
