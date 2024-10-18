package MY_PRACTICE;

// creation of FuelEmptyException
class FuelEmptyException extends RuntimeException{
	public FuelEmptyException() {
		System.out.println("Fuel is empty... pls check");
	}
}

//creation of EngineFailureException
class EngineFailureException extends RuntimeException{
	public EngineFailureException() {
		System.out.println("Engine condition... pls check");
	}
}

//similarly TyrePunctureException...

public class ExceptionTripExample {

	public static void main(String[] args) {
		try {  //handling the exception
			makeMyTrip(15,"good");
		}catch (FuelEmptyException e) {
			e.printStackTrace();
		}catch (EngineFailureException e) {
			e.printStackTrace();
		}
	}

	static void makeMyTrip(int fuelLevel, String engineCondition) throws FuelEmptyException,EngineFailureException{
		//handling --- postponing handling the exception
		fuelCheck(fuelLevel);
		engineConditionCheck(engineCondition);
	}
	static void fuelCheck(int fuelLevel) {
		if(fuelLevel<=10) {
			throw new FuelEmptyException();  // raising exception
		}else {
			System.out.println("enough fuel");
		}
	}
	static void engineConditionCheck(String condition) {
		if(condition.equals("not good")) {   
			throw new EngineFailureException();  // raising exception
		}else {
			System.out.println("good");
		}
	}

}
