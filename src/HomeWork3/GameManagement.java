package HomeWork3;

import java.util.List;

public class GameManagement implements GameInterface {
	
	public void sell(Gamer gamer,Game game) {
		if(gamer.balance>=game.cost) {
		gamer.balance-=game.cost;
		List<Game> library1 = gamer.getLibrary();
		library1.add(game);
		
		gamer.numberOfGames++;
		System.out.println(gamer.id + " nicknameli oyuncu " + game.cost + " kar��l���nda " + game.name + " oyununu sat�n ald�.");
		}
		else
			System.out.println("Bakiyeniz yeterli de�il");
	}

	
	
	public void sellWithCampaign(Gamer gamer,Game game,Campaign campaign) {
		if(gamer.balance>=game.cost) {
		game.discountCost= game.cost - (game.cost*campaign.discount)/100;
		gamer.balance = game.discountCost;
		gamer.numberOfGames++;
		System.out.println(gamer.id + " nicknameli oyuncu " + game.discountCost + " kar��l���nda " + campaign.name + " ile " +game.name + " oyununu sat�n ald�.");
		
		}
		else
			System.out.println("Bakiyeniz yeterli de�il");
		
	}
	
	public void updatePrice(Game game,double price) {
		game.cost = price;
	}
	
	public void add(Game game) {
		System.out.println(game.name+ " ba�ar�yla eklendi.");
		
	}
	
	public void delete(Game game) {
		System.out.println(game.name + " ba�ar�yla silindi.");
		game=null;
		
	}
	

}
