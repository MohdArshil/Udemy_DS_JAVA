package user;

import remotes.RemoteControl;
import devices.Projector;
import devices.SurroundSoundSystem;
import devices.TV;

public class Person {
	
	public static void main (String args[]){
	
		Projector niceProjector = new Projector();
		SurroundSoundSystem ss = new SurroundSoundSystem();
		
		RemoteControl remoteControl = RemoteControl.getInstance();
		
		remoteControl.connectToDevice(niceProjector);
		remoteControl.clickOnButon();
		remoteControl.clickOffButon();
		
		remoteControl.connectToDevice(ss);
		remoteControl.clickOnButon();
		remoteControl.clickOffButon();

	}
	
}
