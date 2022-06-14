package com.javaLearning;

public class ClassDetails {
String Student_name;
String Class_name;

ClassDetails(String name,String name1){
	Student_name=name;
	Class_name=name1;
	
}
public void student() {
	System.out.println("student name is"+Student_name+"class name is"+Class_name);
}
	public static void main(String[] args) {
ClassDetails classdetails=new ClassDetails("prince", "tenth standard");
classdetails.student();
	}

}
