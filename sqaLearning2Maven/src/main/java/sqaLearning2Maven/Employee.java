package sqaLearning2Maven;
//Create an Employee Class with IdNum, exprYr. Define a default and overloaded constructor for Person class and Employee Class. 
public class Employee extends Person {
	private int intIdNum;
	private int intyear;
	public Employee(){
		System.out.println("emloyee class default constructor");
		this.intIdNum=1001;
		this.intyear=2010;
	}
	public Employee(String strName, int intAge, String strGender, int intIdNum, int intYear){
		super(strName, intAge, strGender);
		this.intIdNum=intIdNum;
		this.intyear=intYear;
		System.out.println("overloaded constructor for child class Employee");
	}
	
	public int getIntIdNum() {
		return intIdNum;
	}
	public void setIntIdNum(int intIdNum) {
		this.intIdNum = intIdNum;
	}
	public int getIntyear() {
		return intyear;
	}
	public void setIntyear(int intyear) {
		this.intyear = intyear;
	}
	
	
}
