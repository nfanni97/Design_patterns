package example;

public class GoodKid implements Kid{
	
	private String gift;
	
	public GoodKid(String s){
		gift = s;
	}

	@Override
	public String getGift() {
		return gift;
	}
	
	@Override
	public void setGift(String s) {
		gift = s;
	}

}
