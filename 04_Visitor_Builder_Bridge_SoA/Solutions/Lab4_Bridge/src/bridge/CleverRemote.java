package bridge;

public class CleverRemote extends RemoteControl {
    public CleverRemote(Device d) {
        this.implementor = d;
    }

    public void up() {
        this.currentChannel++;
        this.implementor.tuneChannel(this.currentChannel);
    }

    public void down() {
        this.currentChannel--;
        this.implementor.tuneChannel(this.currentChannel);
    }
}
