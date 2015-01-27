package sqaLearning2Maven;

public class iphone implements CellPhone {
	int BatteryLife= StartBatteryLife;
	public int PlayGame(){
		if (BatteryLife>50)
		{
			System.out.println("Remaining battery is :" );
			return (BatteryLife - 50);
		}
		else
		{
			System.out.println("Low Battery for movies");
			return BatteryLife;
		}
		
	}
	
	public int PlayMovie(){
		if (BatteryLife>250)
		{
			System.out.println("Remaining battery is :" );
					return (BatteryLife - 20) ;
		}
		else
		{
			System.out.println("Low Battery for movies");
			return BatteryLife;
		}
	}
}
