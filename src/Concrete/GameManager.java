package Concrete;

import Abstract.IGameService;
import Entity.Campaing;
import Entity.Game;

public class GameManager implements IGameService {

	@Override
	public void compaigngame(Campaing compaign, Game game) {
	
		
	}

	@Override
	public void gameAdd(Game game) {
		System.out.println("Yeni Oyunumuz : "+ game.getName()+" Sisteme Eklenmiþtir.");
	}

	@Override
	public void gameDelete(Game game) {
		System.out.println("Oyunumuz : "+ game.getName()+" Sistemden Silinmiþtir.");
		
	}

	@Override
	public void gameUpdate(Game game, int gameId, String gameName, Double gamePrice) {
		game.setName(gameName);
		game.setId(gameId);
		game.setPrice(gamePrice);
		System.out.println(game.getName()+" Ýsimi Ürün Günccellendi.");
		
	}

}
