package HomeWork5.dataAccess.abstracts;

import java.util.List;

import HomeWork5.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	User get(String email);
	List <User> getAll();
}
