package Concrete;

import Abstract.IGamerCheckService;
import Entity.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean checkifrealperson(Gamer gamer) {
		
		return false;
	}

}
