import java.util.Scanner;
class electricitybill {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the old readings:");
		int oldreading=scanner.nextInt();
		System.out.println("enter the curren readings:");
		int currentreading=scanner.nextInt();
		int unitsConsumed= currentreading-oldreading ;
		double billAmount=calculateBill(unitsConsumed);
		System.out.println("units consumed:"+unitsConsumed);
		System.out.println("bill amount:"+billAmount);
	}
	private static double calculateBill(int unitsConsumed)
	{
		double billAmount=0;
		if (unitsConsumed<=50)
		{
			unitsConsumed=50*1;
		}else if (unitsConsumed<=100)
		{
			billAmount=50*1+(unitsConsumed-50)*2;
		}
		else if(unitsConsumed<=200){
			billAmount=50*1+50*2+(unitsConsumed-100)*3;
		}
		else if(unitsConsumed<=400){
			billAmount=50*1+50*2+100*3+(unitsConsumed-200)*4;
		}else
		{
			billAmount=50*1+50*2+100*3+200*4+(unitsConsumed-400)*5;
		}
		return billAmount;
	}
}
