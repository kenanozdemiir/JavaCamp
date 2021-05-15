package HomeWork3;



public class Game  {
	int id;
	String name;
	double cost;
	double discountCost;
	Campaign campaign;
	
	Game(int id,String name,double cost){
		this.id=id;
		this.name=name;
		this.cost=cost;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getDiscountCost() {
		return discountCost;
	}

	public void setDiscountCost(double discountCost) {
		this.discountCost = discountCost;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
	
	
	

}
