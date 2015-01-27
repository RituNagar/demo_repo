package sqaLearning2Maven;
//Write a differentClass “FlowerComparision” and define a main method in it.
//In method create 5 obejcts of FlowerEquals.
//1 - Rose, Red, Summer
//2- Rose, White, Summer
//3- Rose, Yellow, Summer
//4- Rose, Red, Summer
//5 - Lotus, white, Summer.
//Compare objects 1 and 2, 1 and 3, 1 and 4, 1 and 5, 2 and 3, 2 and 4, 2 and 5, 3 and 4, 3 and 5, 4 and 5.
public class FlowerComparision {
	public static void main(String args[]){
		FlowerEquals f1= new FlowerEquals("Rose","red","Summer");
		FlowerEquals f2= new FlowerEquals("Rose","white","Summer");
		FlowerEquals f3= new FlowerEquals("Rose","yellow","Summer");
		FlowerEquals f4= new FlowerEquals("Rose","red","Summer");
		FlowerEquals f5= new FlowerEquals("Lotus","white","Summer");
		System.out.println("1 = 2 : "+ f1.equals(f2));
		System.out.println("1 = 3 : "+ f1.equals(f3));
		System.out.println("1 = 4 : "+ f1.equals(f4));
		System.out.println("1 = 5 : "+ f1.equals(f5));
		System.out.println("2 = 3 : "+ f2.equals(f3));
		System.out.println("2 = 4 : "+ f2.equals(f4));
		System.out.println("2 = 5 : "+ f2.equals(f5));
		System.out.println("3 = 4 : "+ f3.equals(f4));
		System.out.println("3 = 5 : "+ f3.equals(f5));
		System.out.println("4 = 5 : "+ f4.equals(f5));
	}

}
