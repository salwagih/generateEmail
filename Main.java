import java.util.*;

public class Main {
public static void main(String [] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your first name");
	String fName = scan.next();
	System.out.println("Enter your last name");
	String lName = scan.next();
	Email email = new Email(fName , lName);
	
		int choice = -1;
		do {
			System.out.println("\n********\n Enter you choice\n1.Show Info\n2.Change Password\n3.Change MailBox Capacity\n4.Set Alternate Mail\n5 Exit");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				email.getInfo();
				break;
			case 2:
				email.setPassword();
				break;
			case 3 :
				email.setMailCapacity();
				break;
			case 4:
				email.alternateEmail();
			case 5:
				System.out.println("Thank you for using this application");
					break;
					default :
					System.out.println("Invalid choice\n Enter proper choice agai");
			}
}
		while(choice!=5);
		
}
}
