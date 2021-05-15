package HomeWork3;

public class GamerCheck implements GamerCheckInterface {

	public boolean checkIfRealPerson(Gamer gamer) {
		if(gamer.identityNumber.length()==11) {
			return true;
		}
		return false;
		
		
		}
	
}
