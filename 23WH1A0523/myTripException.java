package javaDemo;

class FuelEmptyException extends RuntimeException {
	FuelEmptyException(){
		System.out.println("fuel is empty plz check..");
	}
}
class EngineFailureException extends RuntimeException{
	EngineFailureException(){
		System.out.println("engine failed check...");
	}
}
class TyrePunctureException extends RuntimeException{
	TyrePunctureException(){
		System.out.println("tyre punctured check..");
	}
}
public class MyTripEx {
	public static void main(String args[]) {
		try {
			makeMyTrip(18,"good","good");
		}
		catch(FuelEmptyException e){
			e.printStackTrace();
		}
		catch(EngineFailureException e){
			e.printStackTrace();
		}
		catch(TyrePunctureException e) {
			e.printStackTrace();
		}
	}

	private static void makeMyTrip(int fuelLevel,String engineCond ,String tyreCond) throws FuelEmptyException,TyrePunctureException,EngineFailureException {
		fuelcheck(fuelLevel);
		engcheck(engineCond);
		tyrecheck(tyreCond);
	}
	static void tyrecheck(String tyreCond) {
		if (tyreCond=="not good") {
			throw new TyrePunctureException();
		}
		else {
			System.out.println("tyre is good");
		}
	}
	static void fuelcheck(int fuelLevel) {
		if(fuelLevel<=10) {
			throw new FuelEmptyException();
		}
		else {
			System.out.println("fuel level is good");
		}
	}
	static void engcheck(String engineCond) {
		if (engineCond=="not good") {
			throw new EngineFailureException();
		}
		else {
			System.out.println("engine is good");
		}
	}
}
