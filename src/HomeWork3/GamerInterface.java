package HomeWork3;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public interface GamerInterface {
	public void register(Gamer gamer) throws RemoteException;
	public void delete(Gamer gamer);
	public void login(Gamer gamer);
	public void logout(Gamer gamer);
	public void updateEmail(Gamer gamer,String email);
	public void addMoney (Gamer gamer,double Money);
	public void showBalance(Gamer gamer);

}
