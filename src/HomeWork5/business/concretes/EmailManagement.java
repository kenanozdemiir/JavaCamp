package HomeWork5.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import HomeWork5.business.abstracts.EmailCheckService;
import HomeWork5.entities.concretes.User;

public class EmailManagement implements EmailCheckService{
	
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public boolean verifyEmail(User user) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
				Pattern.CASE_INSENSITIVE);
				
				if( pattern.matcher(user.getEmail()).find()) {
				System.out.println("E-posta adresi doðrulandý.");
				return true;
				}
				else {
					System.out.println("E-posta adresi doðrulanamadý.");
					return false;
				}
	}

	@Override
	public void sendConfirm(User user) {
		System.out.println("Dogrulama e-postasý þu e-mail adresine gönderildi: "+user.getEmail());
		
	}

	@Override
	public boolean checkDouble(User user, List<User> users) {
		for(User checkuser : users) {
			if(checkuser.getEmail().equals(user.getEmail())) {
				System.err.println("Bu mail adresi sisteme zaten kayýtlý.");
			}
		}
		return true;
	}
	
	

}
