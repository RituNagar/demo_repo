package sqaLearning2Maven;

public class Employeeoverridecaller {
public static void main(String args[]){
	Employeeoverriding obj= new Employeeoverriding();
	System.out.println(obj.intMinAge);
	obj.PrintSocialId();
	
	Person obj1= new Employeeoverriding();
	System.out.println(obj1.intMinAge);
	obj1.PrintSocialId();
}
}

