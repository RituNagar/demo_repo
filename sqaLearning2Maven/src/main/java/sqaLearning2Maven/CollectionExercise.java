package sqaLearning2Maven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Create a class CollectionExercise
//Create a method testArrayList, in this method:
//Create object  of ArrayList
//Add 5 names String  to an ArrayList
//iterate the List using the for loop and print the names.
//
//Create a method testHashSet, in this method:
//Create an Object of HashSet Class
//add 5 duplicate names to the Set class .
//Iterate the Set using for loop and print the names.
//
//Create a method testHashMap, in this method:
//Create an object of HashMap class.
//Insert the 5 stateCode, StateName into HashMap.
//Repeat one of the stateCode with different Statename.
//Itererate the map using for loop and print the codes and name.
//
//Call all the above 3 methods from main method.
public class CollectionExercise {
	public static void main(String args[]){
		testArrayList();
	}
	
	public static void testArrayList(){
		List<String> myString=new ArrayList<String>();
		myString.add("Ram");
		myString.add("Sakhi");
		myString.add("Ritu");
		myString.add("Swati");
		myString.add("Dadu");
		for(String element : myString){
			System.out.println("Name : " + element);
		}
			
	}
	
	public static void testHashSet(){
		Set<String> myHashset=new HashSet<String>();
		
	}

}
