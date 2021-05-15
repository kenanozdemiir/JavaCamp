package HomeWork3;

import java.rmi.RemoteException;

public class Test {
	public static void main(String [] args) throws RemoteException {
		Gamer gamer1 = new Gamer("kenansid","Kenan","Özdemir","28730436586","kenanozdemiir@gmail.com",1997);
		
		Gamer gamer2 = new Gamer("enginsid","Engin","Demiroð","11223344556","engindemiro@gmail.com",1990);
		GamerManagement gamerManager = new GamerManagement();
		GameManagement gameManager = new GameManagement();
		Game game1 = new Game(1,"Valorant",20);
		Game game2 = new Game(2,"Cs-go",30);
		Game game3 = new Game(3,"League Of Legends",40);
		Game game4 = new Game(4,"The Witcher 3 ", 25);
		
		Campaign campaign1 = new Campaign("Yaz kampanyasý",10);
		Campaign campaign2 = new Campaign("Kýþ kampanyasý",20);
		;
		gamerManager.register(gamer1);
		gamerManager.register(gamer2);
		gamerManager.addMoney(gamer1,500);
		gamerManager.showBalance(gamer1);
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		gameManager.add(game4);
		System.out.println("************");
		System.out.println();
		
		gameManager.sell(gamer1,game1);
		gamerManager.showBalance(gamer1);
		gamerManager.addMoney(gamer2,20);
		gameManager.sell(gamer2,game1);
		gameManager.sellWithCampaign(gamer1,game3,campaign2);
		
		
		
		
		
		
		
		
		
		
				
				
	
	}
	
	

}
