package HomeWork5.business.concretes;

import HomeWork5.business.abstracts.UserCheckService;
import HomeWork5.entities.concretes.User;

public class UserManagement implements UserCheckService {

	@Override
	public boolean userCheck(User user) {
		if(user.getName().length()<3 || user.getSurname().length()<3) {
			System.err.println("Kullan�c�n�n ad� en az iki karakterden olu�mal�d�r.");
			return false;
			}
		if(user.getPassword().length()<6) {
			System.err.println("�ifre 6 haneden az olamaz.");
			return false;
		}
		return true;
		}
	
}
