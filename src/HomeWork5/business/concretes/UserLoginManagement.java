package HomeWork5.business.concretes;

import HomeWork5.business.abstracts.LoginCheckService;
import HomeWork5.entities.concretes.User;

public class UserLoginManagement implements LoginCheckService {

	public void login(User user, String email, String password) {
		if(user.getEmail()==email && user.getPassword()==password) {
			System.out.println(user.getEmail()+ " Kullan�c� giri�i ba�ar�l�.");
		}
		else
			System.out.println("Kullan�c� bilgileri hatal�.");
		
	}

}
