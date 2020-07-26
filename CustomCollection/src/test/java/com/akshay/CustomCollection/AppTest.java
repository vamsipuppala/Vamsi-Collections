package com.akshay.CustomCollection;



import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AppTest extends TestCase {
	@Test
	public void testIntialList() {
		CustomList<Integer> myList=new CustomList<Integer>();
		Assert.assertEquals(0,myList.size()); 
	}
	@Test
	public void testGetMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(21);
		int t=myList.get(0);
		Assert.assertEquals(21,t); 
	}
	@Test
	public void testToStringMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(21);
		myList.add(22);
		myList.add(23);
		Assert.assertEquals("[21,22,23]",myList.toString()); 
	}
	@Test
	public void testSizeMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(21);
		myList.add(22);
		myList.add(23);
		Assert.assertEquals(3,myList.size());
	}
	
	@Test
	public void testRemoveMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(21);
		myList.add(22);
		myList.add(23);
		myList.remove(1);
		Assert.assertEquals(2,myList.size());
	}
	
	@Test
	public void testEnsureCapacityMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(21);
		myList.add(22);
		myList.add(23);
		myList.add(24);
		myList.add(25);
		myList.add(26);
		myList.add(27);
		myList.add(28);
		myList.add(29);
		myList.add(30);
		myList.add(31);
		myList.add(32);
		int removedVal=myList.remove(1);
		Assert.assertEquals(11,myList.size());
	}
	
	
	@Test
	public void testRemoveException() {
		CustomList<Integer> myList=new CustomList<Integer>();
	  boolean thrown = false;

	  try {
		  int removedVal=myList.remove(90);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	
	@Test
	public void testRemoveExceptionZero() {
		CustomList<Integer> myList=new CustomList<Integer>();
	  boolean thrown = false;

	  try {
	    myList.remove(-23);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	
	@Test
	public void testGetException() {
		CustomList<Integer> myList=new CustomList<Integer>();
	  boolean thrown = false;

	  try {
	    myList.get(90);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	@Test
	public void testGetExceptionZero() {
		CustomList<Integer> myList=new CustomList<Integer>();
	  boolean thrown = false;

	  try {
	    myList.get(-90);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	
}
