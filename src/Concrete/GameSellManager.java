package Concrete;

import Abstract.IGameSellService;
import Entity.Campaing;
import Entity.Game;
import Entity.Gamer;

public class GameSellManager implements IGameSellService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName()+" Oyunu"+ gamer.getFirstName()+" Oyuncuya"+game.getPrice()+" Tl'ye Satýldý");
		
	}

	@Override
	public void saleCampaing(Game game, Gamer gamer, Campaing campaing) {
		double priceCampaing=  game.getPrice() -(game.getPrice()*((double) campaing.getCampaingDiscount()/ 100));
		System.out.println(game.getName()+" Oyunu" + gamer.getFirstName()+" Kullanýcýsýna"+ campaing.getCampaingName()+
				" Kampanyasýyla"+game.getPrice()+" TL'ye Satýldý");
		
	}

}
