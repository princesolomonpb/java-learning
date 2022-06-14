package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Length {
	public void LinkedlistLength() {
		LinkedList <Integer>linkedlist=new LinkedList<Integer>();
		linkedlist.add(10);
		linkedlist.add(20);
		System.out.println(linkedlist);
		//add element in first posuition
		linkedlist.addFirst(1);
		System.out.println(linkedlist);
		//add element in last position
		linkedlist.addLast(100);
		System.out.println(linkedlist);
		//size of the linkedlist
		System.out.println(linkedlist.size());
		//get the first index
		System.out.println(linkedlist.getFirst());
		//get the last index value
		System.out.println(linkedlist.getLast());
		//get the index of a value
		System.out.println(linkedlist.get(2));
		System.out.println(linkedlist.indexOf(100));
		System.out.println(linkedlist);
		
		}
	//10,20,30,90,10,10,40,50
	public void commonvalue() {
		LinkedList commonvalues=new LinkedList();
		commonvalues.add(10);
		commonvalues.add(20);
		commonvalues.add(30);
		commonvalues.add(90);
		commonvalues.add(10);
		commonvalues.add(10);
		commonvalues.add(40);
		commonvalues.add(50);
		System.out.println("common  values are"+commonvalues);
		LinkedList commonvalues1=new LinkedList();
		System.out.println(commonvalues1.addAll(commonvalues));
		System.out.println("copied list are"+commonvalues1);
		System.out.println(commonvalues1.set(2, 300));
		System.out.println(commonvalues1);
		
	}
	public void iterator() {
		LinkedList commonvalues3=new LinkedList();
		commonvalues3.add(10);
		commonvalues3.add(20);
		commonvalues3.add(30);
		commonvalues3.add(90);
		commonvalues3.add(10);
		commonvalues3.add(10);
		commonvalues3.add(40);
		commonvalues3.add(50);
		System.out.println(commonvalues3);
		for (Object object : commonvalues3) {
			System.out.println(object);
		}
		for (int i = 0; i < commonvalues3.size(); i++) {
			System.out.println(commonvalues3.get(i));
		}
		//list iterator
		ListIterator listiterator=commonvalues3.listIterator(); 
		while (listiterator.hasNext()) {
			System.out.println(listiterator.next());
			
		}
		while (listiterator.hasPrevious()) {
			Object object = (Object) listiterator.previous();
			System.out.println(object);
		}
	}
	//normal for loop
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Length linkedlist=new Length();
//linkedlist.LinkedlistLength();
//Length commonvalue1=new Length();
//commonvalue1.commonvalue();
		Length commonvalue3=new Length();
		commonvalue3.iterator();
	}
}
