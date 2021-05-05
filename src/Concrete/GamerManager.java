package Concrete;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entity.Gamer;

public class GamerManager extends BaseGamerManager implements IGamerService  {

	private IGamerCheckService _�GamerCheckService;
	
	public GamerManager(IGamerCheckService iGamerCheckService) {
		
		_�GamerCheckService = iGamerCheckService;
	}
	@Override
	public void register(Gamer gamer) {
		if(_�GamerCheckService.checkifrealperson(gamer)) {
			super.register(gamer);
		}
		else {
			System.out.println("Giri� Ge�erli De�ildir.");
		}
		
	}

	@Override
	public void login(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" �simli Kullan�c� Giri� Yapt�.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" �simli Kulan�c� Silindi.");
		
	}
}
