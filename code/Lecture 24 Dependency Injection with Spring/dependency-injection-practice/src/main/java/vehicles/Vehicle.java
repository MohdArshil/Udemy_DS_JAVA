package vehicles;

public class Vehicle {
	
	private Engine engine;

	public Vehicle (Engine engine){
		this.engine = engine;
	}

	public void crankIgnition(){
		engine.startEngine();
		System.out.println("Vehicle is running");
	}
	
}
