package Concrete;

import Abstract.ICampaingService;
import Entity.Campaing;

public class CampaingManager implements ICampaingService {

	@Override
	public void campaingAdd(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kanpanya Sisteme Eklenmiþtir");
		
	}

	@Override
	public void campaingUpdate(Campaing campaing, int campaingId, String campaingName, int campaingDiscount) {
		campaing.setCampaingId(campaingId);
		campaing.setCampaingName(campaingName);
		campaing.setCampaingDiscount(campaingDiscount);
		System.out.println(campaing.getCampaingName()+" Ýsimli Kampanya Güncellenmiþtir.");
		
	}

	@Override
	public void campaingDelete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kanpanya Sistemden Silinmiþtir");
		
	}

}
