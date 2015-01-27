package sqaLearning2Maven;
//Write a class CountryCheck
//in this class write a function "boolean isUSAPresent(String arr[])"that takes String[] as parameter.
//loop through the array and check if "USA" is one of the country.
//if "USA" is not present in string array then throw new Exception "usa not found"
//Write a main method, create a string[] {"India","Japan","China","Canada"}
//call the function isUSAPresent and pass the above created array and put that in try/catch block.
public class CountryCheck {
	public static void main(String args[]){
		String[] str= new String[]{"India","Japan","China","Canada"};
		try{
		boolean aa=isUSAPresent(str);
		System.out.println("USA present : " + aa);
		}catch( Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	public static boolean isUSAPresent(String arr[])throws Exception{
		boolean aa=false;
		for(String countryName:arr){
			if (countryName=="USA"){
				aa=true;
			}
				
		}
		if (aa=false){
			throw new Exception("USA is not present");
		}
			return aa;
	}
}
