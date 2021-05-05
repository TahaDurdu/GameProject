package Concrete;

import Abstract.IGamerService;
import Entity.Gamer;

public class BaseGamerManager implements IGamerService {

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Sisteme Kayýtý Oldunuz");
		
	}

	@Override
	public void login(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Sisteme Giriþ Yaptýnýz");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Sistemden Kayýt Silindi");
	}

}
