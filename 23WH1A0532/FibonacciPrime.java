package sudheepthiapplication;

public class FibonacciPrime {
	  int prime(int num){
		 int count = 0;
		 for(int  i =1 ;i<=num ;i++)
		 {
			 if(num%i == 0)
			 {
				 count+=1;
			 }
		 }
		 if(count==2)
		 {
			 return 1;
		 }
		 return 0;
		 
	 }
		 
	  void fibonacci() {
			int num1 = 0;
			int num2 = 1;
			int sum = 0;
			
//			System.out.printf("%d\t",num1);
//			System.out.printf("%d\t",num2);
			for(int  i = 0; i<=10;i++)
			{
				sum = num1+num2;
//				System.out.printf("%d\t",sum);
				num1 = num2;
				num2 = sum;
				int res = prime(sum);
				if(res == 1)
				{	
					System.out.println(sum);
				}
				
			}
	 }
		
	 
	public static void main(String[] args) {
		FibonacciPrime obj1 =new FibonacciPrime();
		obj1.fibonacci();
		
	}
}
	
	


