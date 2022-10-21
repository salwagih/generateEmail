import java.util.*;

public class Email {

	public Scanner scan = new Scanner(System.in);
	private String fname;
	private String lname;
	private String dept;
	private String email;
	private String password;
	private int mailCapacity = 500;
	private String alter_email;
	
	public Email(String fname , String lname) {
		this.fname = fname;
		this.lname = lname;
		System.out.println("New Employee:" + this.fname + this.lname);
		this.dept = this.setDept();
		this.password = this.generatePassword(8);
		this.email = this.generateEmail();
		
	}
	private String generateEmail() {
		return this.fname.toLowerCase() + "." + this.lname.toLowerCase() + "@" + this.dept.toLowerCase() + ".company.de";
		}
	private String setDept() {
		System.out.println("Department codes \n1 for sales \n2 for Development \n3 for Accounting \n0 for nothing");
		boolean flag = false;
		do {
			System.out.println("Enter Department code:");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 :
				return "sales";
			case 2:
				return "Development";
			case 3 :
				return "Accounting";
			case 0 :
				return "None";
				default :
System.out.println("invalid choice please try again");			}
		}
		while(!flag) ;
			return null;
		
	}
	private String generatePassword(int length) {
		Random r = new Random();
		String capitalCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCharacters = capitalCharacters.toLowerCase();
		String number = "0123456789";
		String symbols ="!§$%&/)=?@#";
		String values = capitalCharacters + smallCharacters + number + symbols;
		String password = "";
		for (int i = 0; i < length; i++) {
			password = password + values.charAt(r.nextInt(values.length()));
		}
		return password;
	}
	public void setPassword() {
		boolean flag = false ;
		do {
			System.out.println("do you want to change your password?(Y/N)");
			char choice = scan.next().charAt(0);
			if(choice == 'Y' || choice == 'y') {
				flag = true;
				System.out.println("Enter current password");
				String temp = scan.next();
				if (scan.equals(this.password)) {
					System.out.println("enter new password");
					this.password = scan.next();
					System.out.println("password changed succesfully");
					
				}
				else {
					System.out.println("Incorrect password");
				}
				
				
			}
			else if(choice == 'N' || choice == 'n') {
				flag = true;
				System.out.println("changing password option canceled");
			}
			else {
				System.out.println("Invalid input");
			}
			
		}
		while(!flag);
	}
	public void setMailCapacity() {
		System.out.println("current capacity" + this.mailCapacity + "mb");
		System.out.println("enter new mail box capacity");
		this.mailCapacity = scan.nextInt();
		System.out.println("Mailbox capacity successfully changed");
	}
	public void alternateEmail() {
		System.out.println("Enter new alternate email");
		this.alter_email = scan.next();
		System.out.println("Alternate email is set");
		
	}
	public void getInfo() {
		System.out.println("New: " + this.fname + "" + this.lname);
		System.out.println("Department " + this.dept);
		System.out.println("Email: " + this.email);
		System.out.println("Mailbox Capacity " + this.mailCapacity);
		
	}
}
