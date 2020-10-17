package bridge;

public class Radio implements Device {
    public void on(){
        // You can imagine various set-up operations happening here
        System.out.println("Radio Device switching on");
    }
    public void off(){
        // You can imagine various shutdown operations happening here
        System.out.println("Radio Device switching off");
    }
    public void tuneChannel(int channel) {
        //This is the actual implementation of how you tune to a channel - include low level details
        System.out.println("Radio Device tuning to channel "+channel);
    }
}
