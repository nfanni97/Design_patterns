package state;

public class TVRemote {
	private TVRemoteState state = new OFF();
	private int volume = 0;
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setState(TVRemoteState s){
		state = s;
	}
	
	public void pushPower(){
		state.pushPower(this);
	}
	public void increaseVolume(){
		state.increaseVolume(this);
	}

	public void decreaseVolume(){
		state.decreaseVolume(this);
	}
}
