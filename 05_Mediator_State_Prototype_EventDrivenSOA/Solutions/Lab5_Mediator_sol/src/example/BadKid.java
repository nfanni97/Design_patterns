package example;

public class BadKid implements Kid{

	private String gift;
	
	public BadKid(String s){
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
