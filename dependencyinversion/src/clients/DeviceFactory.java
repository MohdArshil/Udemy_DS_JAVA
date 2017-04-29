package clients;

import processes.GeneralManufacturingProcess;
import processes.LaptopManufacturingProcess;
import processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
	public static void main(String args[]) {
		GeneralManufacturingProcess manfacturerlaptop = new LaptopManufacturingProcess("HP Envy process");
		manfacturerlaptop.launchProcess();

		GeneralManufacturingProcess manfacturer = new SmartphoneManufacturingProcess("Iphone process");
		manfacturer.launchProcess();

	}
}
