package banks;


class Accounts{
	public String name;
	protected String email; // only can use same package 
	private String password; // only can use in same class
	
	public String getPassword() {
		return this.password;
	}
	
	public void setpessword(String pass) {
		this.password = pass;
	}
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts ac = new Accounts();
		ac.name = "chandan";
		ac.email = "chandan@gamil.com";
		ac.setpessword("chandan");
		System.out.println(ac.getPassword());
	}

}
