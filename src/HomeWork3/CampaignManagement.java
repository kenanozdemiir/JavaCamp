package HomeWork3;

public class CampaignManagement implements CampaignInterface {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.name + " baþarýyla eklendi.");
		
	}
	
	public void delete (Campaign campaign) {
		System.out.println(campaign.name + " baþarýyla silindi.");
		campaign=null;
		
	}
	
	public void updateDiscount( Campaign campaign,double discount) {
		campaign.discount=discount;
		System.out.println("Ýndirim oraný baþarýyla güncellendi.");
	}

}
