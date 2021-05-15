package HomeWork2;

public abstract class User {
	public int id;
	public String name;
	public String surname;
	public String email;
	private String password;
	
	User(int id,String name,String surname,String email){
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.email=email;
	}
	
	public abstract void signIn();
	
	public  void signOut() {
		System.out.println("Signing out..");
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public void changePassword(String newPassword) {
		password=newPassword;
		System.out.println("Your password has been changed!");
	}
	
	

}



