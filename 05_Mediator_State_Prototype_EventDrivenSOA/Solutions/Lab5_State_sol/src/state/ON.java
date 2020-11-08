package state;

public class ON extends TVRemoteState {

	@Override
	public void pushPower(TVRemote t) {
		System.out.println("Turn OFF the TV");
		t.setState(new OFF());
	}

	@Override
	public void increaseVolume(TVRemote t) {
		t.setVolume(t.getVolume()+1);
		System.out.println(String.format("Volume is currently: %d",t.getVolume()));

	}

	@Override
	public void decreaseVolume(TVRemote t) {
		t.setVolume(t.getVolume()-1);;
		System.out.println(String.format("Volume is currently: %d",t.getVolume()));
	}

}
