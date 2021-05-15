package HomeWork5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import HomeWork5.dataAccess.abstracts.UserDao;
import HomeWork5.entities.concretes.User;

public class ListUserDao implements UserDao{
	List<User> users= new ArrayList<User>();
	
	public void add(User user) {
		System.out.println("Üye kaydedildi " + user.getName() +" " + user.getSurname());
		users.add(user);
	}
	
	public void delete(User user) {
		System.out.println(user.getName() + " " + user.getSurname() + " isimli kullanýcýmýz sistemden silindi.");
		users.remove(users.indexOf(user));
	}
	
	public User get(String email) {
		User correctUser=null;
		for(User user:users) {
			
			if(user.getEmail()==email)
				correctUser=user;
			else
				return null;
			}
		return correctUser;
		
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}
	

}
