package state;

public class OFF extends TVRemoteState {

	@Override
	public void pushPower(TVRemote t) {
		System.out.println("Turn ON the TV");
		t.setState(new ON());

	}

	@Override
	public void increaseVolume(TVRemote t) {
		System.out.println("TV is OFF can't increase volume.");
	}

	@Override
	public void decreaseVolume(TVRemote t) {
		System.out.println("TV is OFF can't decrease volume.");
	}

}
