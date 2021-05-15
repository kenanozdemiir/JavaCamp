package HomeWork5.business.abstracts;

import java.util.List;

import HomeWork5.entities.concretes.User;

public interface UserService {
	
	void addSystem(User user);
	List<User> getAll();

}
