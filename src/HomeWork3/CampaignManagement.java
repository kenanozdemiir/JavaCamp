package HomeWork3;

public class CampaignManagement implements CampaignInterface {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.name + " ba�ar�yla eklendi.");
		
	}
	
	public void delete (Campaign campaign) {
		System.out.println(campaign.name + " ba�ar�yla silindi.");
		campaign=null;
		
	}
	
	public void updateDiscount( Campaign campaign,double discount) {
		campaign.discount=discount;
		System.out.println("�ndirim oran� ba�ar�yla g�ncellendi.");
	}

}
