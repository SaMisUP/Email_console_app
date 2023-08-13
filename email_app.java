package Email_App;

public class email_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		email em1 = new email("John","Doe");
		//this was a test for the getter and setter of password
		//em1.setpassword("Okay_goodbye");
		//System.out.println("This is your Password: "+ em1.getPassword());
		System.out.println(em1.showInfo()+"\nThanks for stopping by");
		
	}

}
