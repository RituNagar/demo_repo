package sqaLearning2Maven;

import java.text.StringCharacterIterator;

//Write a class ExceptionExample in which:
//Write a function “StringCheck” which takes a parameter of String
//StringCheck throws a new “Exception” if String is of more than 10 character.
//From the main method call StringCheck and enclose the caller with try/catch.
//Write another function “ArrayElement” which takes a int[] as parameter.
//ArrayElement return the element at index array.length.
//Put the function in try/catch.
//In catch block print the total length of array.

public class ExceptionExample {
	
	public static void main(String args[]){
		int[] arr= new int[]{1,2,3,4};
		int getLength=ArrayElement(arr);
		System.out.println("Lenght of array is :" + getLength);
		String str="Example Exception";
		try{
			StringCheck(str);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
public static void StringCheck(String name)throws Exception{
	// Exception myException = new Exception("String should be less than 10 characters");
	 if (name.length()>10){
		 System.out.println("lenght is : " + name.length());
		 //throw myException;
		 throw new Exception("String should be less than 10 characters");
	 }
}

public static int ArrayElement(int[] arr){	
	try{
		return arr[arr.length - 1];
	}catch (Exception e){
		System.out.println("Lenght of array is " + arr.length);
		return 0;
	}
	
}
}
