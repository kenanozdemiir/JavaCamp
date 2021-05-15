package HomeWork5.business.abstracts;

import HomeWork5.entities.concretes.User;

public interface LoginCheckService {
	
	void login(User user,String email,String password);

}
