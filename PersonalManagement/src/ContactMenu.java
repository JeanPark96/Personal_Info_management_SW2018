import java.util.HashMap;
import java.util.Scanner;

public class ContactMenu {
	public void contactList() {
		boolean repeat=true;
		do {
			
			ContactMenu contact=new ContactMenu();
			contact.contactMenu();
			Scanner scanner=new Scanner(System.in);
			int input=scanner.nextInt();
			int receive_num=contact.inputContactMenuNum(input);
			if(receive_num==-1) {
				repeat=false;
			}
			scanner.close();
		}while(repeat);
		
	}
	
	public void contactMenu() {
		System.out.println("===========================");
		System.out.println("Manage Your Contact");
		System.out.println("1. Create Contact");
		System.out.println("2. View Contact");
		System.out.println("3. Update Contact");
		System.out.println("4. Delete Contact");
		System.out.println("5. Back to Main Menu");
		System.out.println("===========================");
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
		
	}
	public void createContact() {
		int id=0;
		boolean repeat=true;
		do {
			System.out.println("연락처를 입력해주세요.");
			HashMap<Integer,Contact> inputContact=new HashMap<Integer,Contact>();
			Scanner scanner=new Scanner(System.in);
			System.out.print("이름:");
			String name=scanner.nextLine();
			System.out.print("전화번호:");
			String phone_num=scanner.nextLine();
			System.out.print("이메일:");
			String email=scanner.nextLine();
			inputContact.put(++id,new Contact(name,phone_num,email));
			
			System.out.print("추가 입력 하시겠습니까?(y/n)");
			String answer=scanner.next();
			if(answer=="n") {
				repeat=false;
			}
			scanner.close();
		}while(repeat);
		
	}
	public void updateContact() {
		
	}
	public void deleteContact() {
		
	}
}
