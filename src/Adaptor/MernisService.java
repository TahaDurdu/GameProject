package Adaptor;

import java.rmi.RemoteException;

import Abstract.IGamerCheckService;
import Entity.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements IGamerCheckService {

	@Override
	public boolean checkifrealperson(Gamer gamer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());
		}  catch (RemoteException e) {
			return false;
		}
	}

}
