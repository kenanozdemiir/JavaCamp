package HomeWork3;

public interface GameInterface {
	
		public void sell(Gamer gamer,Game game);
		public void sellWithCampaign(Gamer gamer,Game game,Campaign campaign);
		public void add(Game game);
		public void delete(Game game);
		public void updatePrice(Game game,double price);



}
