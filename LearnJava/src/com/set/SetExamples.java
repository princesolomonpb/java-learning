package com.set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class SetExamples {
//	Create a linkedHashSet for the below values
//    Input : List = 10,20,30,40,50,60,70,80,90,10,20
public void HashSet() {
	LinkedHashSet hs=new LinkedHashSet();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	hs.add(50);
	hs.add(60);
	hs.add(70);
	hs.add(80);
	hs.add(90);
	hs.add(10);
	hs.add(20);
	hs.add(30);
	System.out.println("linked hashsets are"+hs);
	List hs1=new ArrayList();
	hs1.addAll(hs);
	System.out.println(hs1);
	System.out.println("commonvaluesare"+hs1.retainAll(hs));
	
}
//	Create a TreeSet for the below values
//    Input : List = 10,20,30,40,50,60,70,80,90,10,20
	public void TreeSet() {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(25);
		ts.add(60);
		ts.add(70);
		ts.add(80);
		ts.add(90);
		ts.add(10);
		ts.add(20);
		System.out.println("treeset are"+ts);
	}
//	 Create a HashSet for the below values
//  Input : List = 10,20,30,40,50,60,70,80,90,10,20
	public void Hashset() {
		HashSet hs =new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		hs.add(80);
		hs.add(90);
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(20);
		System.out.println("hash set are"+hs);
		
		//return the common values
		HashSet hs1 =new HashSet();
		hs1.addAll(hs);
		System.out.println("common values are"+hs1);
		System.out.println("hash set common values are"+hs.retainAll(hs1));
	}
//	 Convert the below list in to set(use addAll()) method
//     Input : List = 10,20,30,90,10,10,40,50
	public void AddAll() {
		List<Integer> li=new ArrayList<Integer>() ;
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println("list values are"+li);
		System.out.println("list is convert tos et ");
		Set<Integer> se =new HashSet<Integer>();
		se.addAll(li);
		System.out.println("set values are"+se);
		
	}
//	Get the each value of set by using enhanced  for loop
//    Input:   List = 105,205,305,405,505,605,705,805

public void EnhancedLoop() {
	List li=new ArrayList();
	li.add(105);
	li.add(205);
	li.add(305);
	li.add(405);
	li.add(505);
	li.add(605);
	li.add(705);
	li.add(805);
	System.out.println("list values are"+li);
	Set se=new HashSet();
	se.addAll(li);
	System.out.println("set values are are"+se);
	System.out.println("enhanced loop ");
	for (Object object : se) {
		System.out.println("enhanced loop values are"+object);
		
	}
}
//Create a TreeSet and iterate each value in the set by using enhanced for loop
//Input : List = 10,20,30,40,50,60,70,80,90,10,20
public void TreeSetIterate() {
	TreeSet ts=new TreeSet();
	ts.add(10);
	ts.add(20);
	ts.add(30);
	ts.add(40);
	ts.add(50);
	ts.add(60);
	ts.add(70);
	ts.add(80);
	ts.add(90);
	ts.add(10);
	ts.add(20);
	System.out.println("treeset are "+ts);
	for (Object object : ts) {
		System.out.println("tree set enhanced loop are"+object);
		
	}
}



	public static void main(String[] args) {
SetExamples linkedhashset=new SetExamples();
linkedhashset.HashSet();
SetExamples treeset=new SetExamples();
treeset.TreeSet();
SetExamples hashset=new SetExamples();
hashset.Hashset();
SetExamples addall=new SetExamples();
addall.AddAll();
SetExamples eloop=new SetExamples();
eloop.EnhancedLoop();
SetExamples treeeloop=new SetExamples();
treeeloop.TreeSetIterate();
	}

}
