package HomeWork5.business.abstracts;

import java.util.List;

import HomeWork5.entities.concretes.User;

public interface EmailCheckService {
	
	boolean verifyEmail(User user);
	public void sendConfirm(User user);
	public boolean checkDouble(User user,List<User> users);
	

}
