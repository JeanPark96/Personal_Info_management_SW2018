import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ContactMenu {
	public static int id = 0, num = 0;
	public static HashMap<Integer,Contact> inputContact;
	
	public void contactList() {
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;
		inputContact = new HashMap<Integer,Contact>();
		do {
			
			ContactMenu contact=new ContactMenu();
			contact.contactMenu();
			
			int input=scanner.nextInt();
			int receive_num = contact.inputContactMenuNum(input);
			if(receive_num == -1) {
				repeat = false;
			}
			
		}while(repeat);
		
	}
	
	public void contactMenu() {
		System.out.println("\n\n===========================");
		System.out.println("Manage Your Contact");
		System.out.println("1. Create Contact");
		System.out.println("2. View Contact");
		System.out.println("3. Update Contact");
		System.out.println("4. Delete Contact");
		System.out.println("5. Back to Main Menu");
		System.out.println("===========================\n");
		System.out.print("Enter Menu Number: ");
	}
	
	public int inputContactMenuNum(int input) {
		ContactMenu contact=new ContactMenu();
		switch(input) {
		case 1:
			contact.createContact();
			break;
		case 2:
			contact.viewContact();
			break;
		case 3:
			contact.updateContact();
			break;
		case 4:
			contact.deleteContact();
			break;
		case 5:
			return -1;
		default:
			System.out.println("Wrong number input.");
			break;
		}
		
		return 0;
	}
	
	public void viewContact() {
		System.out.println("==================================================");
		System.out.println("ID NAME\t PHONE NUMBER \t\t E-MAIL \t");
		System.out.println("==================================================");


		Set <Integer> keys = inputContact.keySet();
		Iterator <Integer> iterate = keys.iterator();
		while(iterate.hasNext()) {
			Integer id_num = iterate.next();
			Contact contact = inputContact.get(id_num);
			if(contact!=null && id_num!=null)
				System.out.println(id_num+"  "+contact.getName()+"\t"+contact.getPhone_num()+"\t"+contact.getEmail());
		}
	
	
	}
	public void createContact() {
		Scanner scanner1 = new Scanner(System.in);
		boolean repeat = true;
		do {
				
			System.out.println("Enter your contact number.");
			System.out.print("name: ");
			String name = scanner1.nextLine();
			System.out.print("phone number: ");
			String phone_num = scanner1.nextLine();
			System.out.print("e-mail: ");
			String email = scanner1.nextLine();
			
			inputContact.put(++id,addContactInfo(name, phone_num, email));
			num++;
			System.out.print("continue?(y/n): ");
			String answer = scanner1.nextLine();
			if(answer.equals("n")) {
				repeat = false;
			}
				
			
		}while(repeat);
		
	}
	
	public Contact addContactInfo(String name, String phone_num, String email) {
		Contact contact = new Contact(name, phone_num, email);	
		return contact;
	}
	
	public void updateContact() {
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		boolean repeat = true;
		do {
				System.out.println("[ID search]: ");
				int receive_id = scanner2.nextInt();
				System.out.print("name: ");
				String name = scanner1.nextLine();
				System.out.print("phone number: ");
				String phone_num = scanner1.nextLine();
				System.out.print("e-mail: ");
				String email = scanner1.nextLine();
				
				updateContactInfo(receive_id,name,phone_num,email);
				System.out.print("continue?(y/n): ");
				String answer = scanner1.nextLine();
				if(answer.equals("n")) {
					repeat = false;
				}
		}while(repeat);
		
	}
	
	public Contact updateContactInfo(int input_id, String name, String phone_num, String email) {
		Contact contact = new Contact(name, phone_num, email);
		inputContact.put(input_id,contact);
		Contact c = inputContact.get(input_id);
		
		return c;
	}
	
	public void deleteContact() {
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		boolean repeat=true;
		do {
				System.out.println("Enter your contact number.");
				System.out.print("[ID search]: ");
				Integer receive_id = scanner1.nextInt();
				inputContact.remove(receive_id);

				System.out.print("continue?(y/n): ");
				String answer = scanner2.nextLine();
				if(answer.equals("n")) {
					repeat = false;
				}
				
		}while(repeat);
	}
}