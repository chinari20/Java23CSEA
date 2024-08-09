package practicepack;

public class AccessingInstVariable {
	int rollNumber = 518 ;
	public static void main(String[] args) {
		//System.out.println(rollNumber);
		
		AccessingInstVariable obj1 = new AccessingInstVariable();
		System.out.println(obj1.rollNumber);
		String res = obj1.getAddress("2334");
		System.out.println(res);
		
	}
	public String getAddress(String house_num ) {
		System.out.println(house_num) ;
		return "thank you";
	}

}
