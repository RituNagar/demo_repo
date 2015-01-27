package sqaLearning2Maven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
//import java.nio.file.Files;
import java.util.Properties;

//Write a class StudentReader.java, Write the function readStudentsFromFile() to read the above created properties file and create student object for every row.
//Stores all the students in an ArrayList
//Loop through the arrayList and print the student names
//Write a main class that will create the object of StudentReader and call the function readStudentsFromFile();
public class StudentReader {
	private static final Reader FileReader = null;
	public static void main(String args[]){
		Properties props = readStudentFromFile("D:\\Ritu\\practJava\\studentInfo.properties");
        System.out.println(props.getProperty("1"));
        System.out.println(props.getProperty("2"));
        System.out.println(props.getProperty("3"));
        System.out.println(props.getProperty("4"));
        System.out.println(props.getProperty("5"));
        List<String>arr = new ArrayList<String>();
        	arr.add(props.getProperty("1"));
        	arr.add(props.getProperty("2"));
        	arr.add(props.getProperty("3"));
        	arr.add(props.getProperty("4"));
        	arr.add(props.getProperty("5"));
        for(String student:arr){
        	System.out.println(student);
        }
	}
		public static Properties readStudentFromFile(String fileName){
			Properties props= new Properties();
			File f= new File(fileName);
			//BufferedReader reader = null;
	        try {           
	            BufferedReader reader=new BufferedReader(new FileReader(f));
	            props.load(reader);                 
	        } catch (IOException e) {
	            e.printStackTrace();        
	        } finally {         
	            Object reader;
				if(reader != null){
	                try{
	                    reader.Close();
	                }catch(Exception e){
	                    e.printStackTrace();
	                }
	            }
	        }
	        return props;
			
		}
		public static String getProperty(String key){
	        return "abc";
	    }
}
