package sqaLearning2Maven;

public class EmployeeCaller {
public static void main(String args[]){
	Employee empobj= new Employee();
	System.out.println("Name: " + empobj.getStrName()+"Age: " + empobj.getIntAge()+ "Gender: " + empobj.getStrGender()+ "ID: "+empobj.getIntIdNum()+"Year: "+empobj.getIntyear());
	
	Employee empobj2=new Employee("Swati",30, "f", 1002, 2013);
	System.out.println("Name: " + empobj2.getStrName()+" Age: " + empobj2.getIntAge()+ " Gender: " + empobj2.getStrGender()+ " ID: "+empobj2.getIntIdNum()+" Year: "+empobj2.getIntyear());
	

}

}
