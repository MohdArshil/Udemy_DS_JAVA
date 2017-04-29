package hospital;


public class EmergencyRoomProcess {
	public static void main(String args[]) {

		HospitalManagement ERDirector = new HospitalManagement();
		Employee saha = new Nurse(1, "saha", "checkup", true);
		ERDirector.callUpon(saha);
		Employee rupal = new Doctor(2, "rupal", "emergency", true);
		ERDirector.callUpon(rupal);

	}
}
