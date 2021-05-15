package HomeWork5.business.concretes;

import HomeWork5.business.abstracts.RegisterCheckService;
import HomeWork5.core.concretes.GoogleManager;
import HomeWork5.entities.concretes.User;

public class GoogleAdapter implements RegisterCheckService{
GoogleManager googleManager = new GoogleManager();
	@Override
	public void registerCheck(User user) {
		googleManager.register();
		
	}

}
