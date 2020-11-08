package state;

public class TVRemoteOff implements TVRemoteState {

    @Override
    public void pushPower(TVRemote remote) {
        System.out.println("Turn ON the TV");
        remote.setState(new TVRemoteOn());
    }

    @Override
    public void increaseVolume() {
        System.out.println("TV is OFF can't increase volume.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("TV is OFF can't decrease volume.");
    }
    
}
