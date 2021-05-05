package Abstract;

import Entity.Campaing;

public interface ICampaingService {

	void campaingAdd(Campaing campaing);
	void campaingUpdate(Campaing compaing,int campaingId,String campaingName,int campaingDiscount);
	void campaingDelete(Campaing campaing);
}
