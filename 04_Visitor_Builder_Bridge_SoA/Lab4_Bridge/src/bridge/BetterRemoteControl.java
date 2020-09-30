package bridge;

public class BetterRemoteControl extends RemoteControl {

    public BetterRemoteControl(Device dev) {
        super(dev);
    }

    public void channelUp() {
        setChannel(currentChannel + 1);
    }

    public void channelDown() {
        setChannel(currentChannel - 1);
    }

}
