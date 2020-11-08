package bridge;

//Concrete Implementor 
public class Sony implements Device {
	public void on(){
		// You can imagine various set-up operations happening here
		System.out.println("Sony Device switching on");
	}
	public void off(){
		// You can imagine various shutdown operations happening here
		System.out.println("Sony Device switching off");
	}
	public void tuneChannel(int channel) {
		//This is the actual implementation of how you tune to a channel - include low level details
		System.out.println("Sony Device tuning to channel "+channel);
	}
}