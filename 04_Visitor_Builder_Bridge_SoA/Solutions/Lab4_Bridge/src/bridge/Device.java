package bridge;

//Implementor 
public interface Device {
	public void on();
	public void off(); 
	public void tuneChannel(int channel);
}
