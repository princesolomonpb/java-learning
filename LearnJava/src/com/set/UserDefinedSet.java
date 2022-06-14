package com.set;

import java.util.LinkedHashSet;

public class UserDefinedSet {
	//Create a userdefine Set and insert the 10 employee details
	//Input : empId,name,phone,address,dob,doj,eMail,gender,Sal
	//Output: Using scanner class insert 10 employee details
	int id;
	int pno;
	String name;
	Object address;
	Object dob;
	Object doj;
	Object email;
	String gender;
	int salary;

	UserDefinedSet(int id1,int pno1,String n,Object add,Object dob1,Object doj1,Object e,String g,int sal){
		id=id1;
		pno=pno1;
		name=n;
		address=add;
		dob=dob1;
		doj=doj1;
		email=e;
		gender=g;
		salary=sal;
	
		
	}
	
	public static void main(String[] args) {
UserDefinedSet emp1=new UserDefinedSet(100, 89731, "prince", "65 vaguthankuppam road", "09/09/1996", "20/06/2022", "prinsolomon@gmail.com", "male", 10000);
LinkedHashSet<UserDefinedSet> set=new LinkedHashSet<UserDefinedSet>();
set.add(emp1);
System.out.println(set);
	}

}
