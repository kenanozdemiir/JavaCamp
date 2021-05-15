package HomeWork5.business.concretes;

import java.util.List;

import HomeWork5.business.abstracts.EmailCheckService;
import HomeWork5.business.abstracts.UserCheckService;
import HomeWork5.business.abstracts.UserService;
import HomeWork5.dataAccess.abstracts.UserDao;
import HomeWork5.entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	EmailCheckService emailCheck;
	UserCheckService userCheck;

	public UserManager(UserDao userDao, EmailCheckService emailCheck, UserCheckService userCheck) {
		super();
		this.userDao = userDao;
		this.emailCheck = emailCheck;
		this.userCheck = userCheck;
	}

	@Override
	public void addSystem(User user) {
		if(this.userCheck.userCheck(user)&& emailCheck.verifyEmail(user) && emailCheck.checkDouble(user, userDao.getAll())){
			System.out.println("Doðrulama postasý mailinize gönderildi.");
			this.userDao.add(user);
			this.emailCheck.sendConfirm(user);
			
		}
		else
			System.err.print("Kullanýcý kaydý hatalý.");
		
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
