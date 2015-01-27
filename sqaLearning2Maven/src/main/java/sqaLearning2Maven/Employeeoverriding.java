package sqaLearning2Maven;

public class Employeeoverriding extends Person {
	private int intIdNum;
	private int intyear;
	public int intMinAge=21;
	public Employeeoverriding(){
		System.out.println("emloyee class default constructor");
		this.intIdNum=1001;
		this.intyear=2010;
	}
	public Employeeoverriding(String strName, int intAge, String strGender, int intIdNum, int intYear){
		super(strName, intAge, strGender);
		this.intIdNum=intIdNum;
		this.intyear=intYear;
		System.out.println("overloaded constructor for child class Employee");
	}
	
	public void PrintSocialId(){
		System.out.println("printing social id from overriding");
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
