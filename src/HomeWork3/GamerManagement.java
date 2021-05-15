package HomeWork3;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.*;
//deneme

public class GamerManagement implements GamerInterface{
	

	public void register(Gamer gamer) throws RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		if(kpsPublic.TCKimlikNoDogrula(Long.valueOf(gamer.identityNumber), gamer.name.toUpperCase(), gamer.surname.toUpperCase(),gamer.yearOfBirth)==true) {
			System.out.println(gamer.name + " baþarýyla kayýt oldu.");
		}
		else
			System.err.println("Bilgiler sistemdeki bilgiler ile uyuþmuyor.");
	}
		
	
	public void delete(Gamer gamer) {
		System.out.println(gamer.name + " Oyuncu baþarýyla silindi.");
		gamer=null;
		
	}
	public void login(Gamer gamer) {
		System.out.println(gamer.name + " baþarýyla giriþ yaptýn. ");
	}
	
	public void logout(Gamer gamer) {
		System.out.println(gamer.name + " baþarýyla çýkýþ yaptýn. ");
	}
	
	public void updateEmail(Gamer gamer,String email) {
		gamer.email=email;
	}
	
	public void addMoney (Gamer gamer,double Money) {
		
		gamer.balance+=Money;
	}
	public void showBalance(Gamer gamer) {
		System.out.println(gamer.name +" " + gamer.balance + " TL bakiyen var.");
	}
	
	
}
