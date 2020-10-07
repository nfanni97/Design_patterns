package state;

public class TVRemote {
	private TVRemoteState state = new TVRemoteOff();

	public void setState(TVRemoteState newState) {
		state = newState;
	}
	
	public void pushPower(){
		state.pushPower(this);
	}
	public void increaseVolume(){
		state.increaseVolume();
	}

	public void decreaseVolume(){
		state.decreaseVolume();
	}
}
