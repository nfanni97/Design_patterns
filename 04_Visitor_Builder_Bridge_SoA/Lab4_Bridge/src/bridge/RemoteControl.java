package bridge;

//Abstrastion
public class RemoteControl {
	protected Device implementor;
	protected int currentChannel = 0;
	public RemoteControl(Device dev) {
		implementor = dev;
	}
	//Low-level calls to the implementation
	public void on() {
		implementor.on();
	}
	public void off() {
		implementor.off();   
	}      
	public void setChannel(int channel) {
		currentChannel = channel;
		implementor.tuneChannel(channel);   
	}
}
