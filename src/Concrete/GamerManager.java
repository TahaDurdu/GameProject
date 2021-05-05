package Concrete;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entity.Gamer;

public class GamerManager extends BaseGamerManager implements IGamerService  {

	private IGamerCheckService _ýGamerCheckService;
	
	public GamerManager(IGamerCheckService iGamerCheckService) {
		
		_ýGamerCheckService = iGamerCheckService;
	}
	@Override
	public void register(Gamer gamer) {
		if(_ýGamerCheckService.checkifrealperson(gamer)) {
			super.register(gamer);
		}
		else {
			System.out.println("Giriþ Geçerli Deðildir.");
		}
		
	}

	@Override
	public void login(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Ýsimli Kullanýcý Giriþ Yaptý.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Ýsimli Kulanýcý Silindi.");
		
	}
}
