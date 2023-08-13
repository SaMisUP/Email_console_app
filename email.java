package Email_App;

import java.util.Scanner;

public class email {
	private String firstname;
	private String lastname;
	private String password;
	private int defaultPasswordlength = 26;
	private String department;
	private int mailboxCapacity = 5000;
	private String companySuffix = "Tayco"; 
	private String alternateEmail;
	
	//Constructor to receive the first name & last name
		public email (String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
			//for the name of the user
			System.out.println("Email created with success " + this.firstname + this.lastname +"@gmail.com");
			//for the department he chose
			this.department = setdepartment();
			//this was a test before the show info method
			//System.out.println("The Department is :" + this.department);
			//for the random password that was generated for him
			this.password = rndmpassword(defaultPasswordlength);
			System.out.println("Your password is generated et Voila: "+ this.password);
			//call up all elements to make the email
			//this was a test before the show info method
			//String email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix+".com";
			//System.out.println("Your email according to ur infos is: "+ email);
		};
	//Ask for the department
	private String setdepartment() {
		System.out.print("Hi Mr."+firstname +" "+lastname+
				" Please do as follows or you'll be kickout now\nEnter code department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the code here:");
		Scanner written = new Scanner(System.in);
		int depchoice = written.nextInt();
		if(depchoice == 1) {return "sales";}
		else if(depchoice == 2) {return "development";}
		else if(depchoice == 3) {return "accounting";}
		else {return "";}
	}
	//Generate a random password
	private String rndmpassword(int length) {
		String setpassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_?!@$£*";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random()* setpassword.length());
			password[i] = setpassword.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setmailcapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//Set the alternate email
	public void setAlternateemail(String altemail) {
		altemail = firstname+lastname+"@"+companySuffix+".com";
		this.alternateEmail = altemail;
	}
	//Change the password
	public void setpassword(String pswrd) {
		this.password = pswrd;
	}
	//getters to get the mail box capacity , and alternate email and password
	public int getmailboxcapacity() {return mailboxCapacity;};
	public String getalternateEmail() {return alternateEmail;};
	public String getPassword() {return password;};

	//Change of plan you got to show the info of the user
	
	public String showInfo() {
		return "Your fullname is :"+ firstname +" "+ lastname + 
				"\nCompany name : "+ companySuffix +
				"\nYour MailBox Capacity is : " + mailboxCapacity +" mb";
	}
}
