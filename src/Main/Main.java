package Main;

import Adaptor.MernisService;
import Concrete.BaseGamerManager;
import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.GameSellManager;
import Concrete.GamerManager;
import Entity.Campaing;
import Entity.Game;
import Entity.Gamer;

public class Main {

	public static void main(String[] args) {
		
		BaseGamerManager baseGamerManager = new GamerManager(new MernisService());
		Gamer gamer = new Gamer(1,"Taha","Durdu","9999999999",2000);
		baseGamerManager.register(gamer);
		baseGamerManager.login(gamer);
		baseGamerManager.delete(gamer);
		System.out.println("--------------------------");
		
		GameManager gameManager=new GameManager();
		Game game=new Game(1,"Pugb",50.00);
		gameManager.gameAdd(game);
		gameManager.gameUpdate(game, 1, "Pugb", 40.50);
		gameManager.gameDelete(game);
		System.out.println("--------------------------");
	
		CampaingManager campaingManager=new CampaingManager();
		Campaing campaing =new Campaing(1,"1 nolu Kampanya ", 10);
		campaingManager.campaingAdd(campaing);
		campaingManager.campaingUpdate(campaing, 1, "1 nolu Kampanya ", 15);
		campaingManager.campaingDelete(campaing);
		System.out.println("--------------------------");

		GameSellManager gameSellManager=new GameSellManager();
		gameSellManager.sale(game, gamer);
		gameSellManager.saleCampaing(game, gamer, campaing);
	}

}
