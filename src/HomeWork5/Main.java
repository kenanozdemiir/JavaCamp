package HomeWork5;

import HomeWork5.business.abstracts.LoginCheckService;
import HomeWork5.business.concretes.EmailManagement;
import HomeWork5.business.concretes.UserLoginManagement;
import HomeWork5.business.concretes.UserManagement;
import HomeWork5.business.concretes.UserManager;
import HomeWork5.dataAccess.concretes.ListUserDao;
import HomeWork5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new ListUserDao(),new EmailManagement(),new UserManagement());
		LoginCheckService loginCheck = new UserLoginManagement();
		User user1 = new User("Kenan","Özdemir","kenanozdemiir@gmail.com","123456");
		User user2 = new User("Engin","Demirog","engindemirog@gmail.com","654321");
		User google = new User("Google","Hesabý","google@google.com","google");
		
		userManager.addSystem(user1);
		userManager.addSystem(user2);
		
		
		loginCheck.login(user2, "32", "32");							//HATALI GÝRÝÞ
		loginCheck.login(user1, "kenanozdemiir@gmail.com", "123456"); 	//BAÞARILI GÝRÝÞ
		loginCheck.login(google,google.getEmail(),google.getPassword());
		
		ListUserDao listAll = new ListUserDao();
		listAll.add(user2);
		listAll.add(user1);
		listAll.add(google);
		listAll.getAll();	}

}
