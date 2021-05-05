package Concrete;

import Abstract.IGamerService;
import Entity.Gamer;

public class BaseGamerManager implements IGamerService {

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Sisteme Kay�t� Oldunuz");
		
	}

	@Override
	public void login(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Sisteme Giri� Yapt�n�z");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Sistemden Kay�t Silindi");
	}

}
