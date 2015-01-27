package sqaLearning2Maven;
//Create a Person Class with gender, age and name. 
public class Person {
	private String strGender;
	private int intAge;
	private String strName;
	public int intMinAge=1;
	public Person()
	{
		System.out.println("default constructor for Person class");
		this.strName="Ritu";
		this.intAge=20;
		this.strGender="F";
	}
	
	public Person(String strName, int intAge, String strGender)
	{
		System.out.println("overloaded Constructor");
		this.strName=strName;
		this.intAge=intAge;
		this.strGender=strGender;
		
	}
	
	public void PrintSocialId(){
		System.out.println("printing social id");
	}
	
	public String getStrGender() {
		return strGender;
	}

	public void setStrGender(String strGender) {
		this.strGender = strGender;
	}

	public int getIntAge() {
		return intAge;
	}

	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}
	
	
}
