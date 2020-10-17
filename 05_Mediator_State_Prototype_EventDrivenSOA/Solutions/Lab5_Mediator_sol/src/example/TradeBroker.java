package example;

import java.util.ArrayList;

public class TradeBroker {

	private ArrayList<Kid> tradeoffers = new ArrayList<>();
	
	public void register(Kid k){
		tradeoffers.add(k);
	}
	
	public void trade(){
		/*
		 *  Takes a look at everyone who wants to trade,
		 *  then performs the trade if a pair switches gifts.
		 */
		
		for(int i=0;i<tradeoffers.size();i++){
			for(int j=i+1;j<tradeoffers.size();j++){
				if(!tradeoffers.get(i).getGift().equals(tradeoffers.get(j).getGift())){
					String store = new String(tradeoffers.get(i).getGift());
					tradeoffers.get(i).setGift(tradeoffers.get(j).getGift());
					tradeoffers.get(j).setGift(store);
					System.out.println(tradeoffers.get(j).getGift() + "<->" + tradeoffers.get(i).getGift());
				}
			}
		}
	}
	
	
	
	
}
