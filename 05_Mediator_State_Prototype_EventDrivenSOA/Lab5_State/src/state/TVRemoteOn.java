package state;

public class TVRemoteOn implements TVRemoteState {
    private int volume = 0;

    @Override
    public void pushPower(TVRemote remote) {
        System.out.println("Turn OFF the TV");
        remote.setState(new TVRemoteOff());
    }

    @Override
    public void increaseVolume() {
        volume++;
        System.out.println(String.format("Volume is currently: %d", volume));
    }

    @Override
    public void decreaseVolume() {
        volume--;
        System.out.println(String.format("Volume is currently: %d", volume));
    }

}
