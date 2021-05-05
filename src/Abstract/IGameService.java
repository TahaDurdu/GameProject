package Abstract;


import Entity.Campaing;
import Entity.Game;

public interface IGameService {

	void compaigngame(Campaing compaign,Game game);
	void gameAdd(Game game);
	void gameDelete(Game game);
	void gameUpdate(Game game,int gameId, String gameName,Double gamePrice);
}
