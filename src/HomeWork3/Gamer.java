package HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class Gamer{
	String id;
	String name;
	String surname;
	String identityNumber;
	String email;
	int yearOfBirth;
	int numberOfGames;
	double balance;
	List<Game> library = new ArrayList<Game>();
	
	
	
	public Gamer(String id, String name, String surname, String identityNumber,String email, int yearOfBirth) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.email = email;
		this.yearOfBirth = yearOfBirth;
	}

	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getNumberOfGames() {
		return numberOfGames;
	}

	public void setNumberOfGames(int numberOfGames) {
		this.numberOfGames = numberOfGames;
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Game> getLibrary() {
		return library;
	}

	public void setLibrary(List<Game> library) {
		this.library = library;
	}

	public void showBalance() {
		System.out.println(this.name +" " + this.balance + " TL bakiyen var.");
	}
	
	
	
	
	
	
	
	

}
