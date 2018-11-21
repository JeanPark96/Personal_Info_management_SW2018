import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class ContactMenu {
	int id=0;
	public static HashMap<Integer,Contact> inputContact;
	
	
	public void contactList() {
		Scanner scanner=new Scanner(System.in);
		boolean repeat=true;
		do {
			
			ContactMenu contact=new ContactMenu();
			contact.contactMenu();
			
			int input=scanner.nextInt();
			int receive_num=contact.inputContactMenuNum(input);
			if(receive_num==-1) {
				repeat=false;
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
		System.out.print("메뉴 번호 입력:");
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
		System.out.println("id 이름 \t 전화번호 \t\t 이메일 \t");
		System.out.println("==================================================");


		Set <Integer> keys= inputContact.keySet();
		Iterator <Integer> iterate=keys.iterator();
		while(iterate.hasNext()) {
			Integer id_num=iterate.next();
			Contact contact=inputContact.get(id_num);
			if(contact!=null&&id_num!=null)
				System.out.println(id_num+" "+contact.getName()+"\t"+contact.getPhone_num()+"\t"+contact.getEmail());
		}
	
	}
	public void createContact() {
		Scanner scanner1=new Scanner(System.in);
		
		inputContact=new HashMap<Integer,Contact>();
		boolean repeat=true;
		do {
				System.out.println("연락처를 입력해주세요.");
						
				System.out.print("이름:");
				
					String name=scanner1.nextLine();
					System.out.print("전화번호:");
					String phone_num=scanner1.nextLine();
					System.out.print("이메일:");
					String email=scanner1.nextLine();
					inputContact.put(++id,new Contact(name,phone_num,email));
					
					System.out.print("추가 입력 하시겠습니까?(y/n)");
					String answer=scanner1.nextLine();
					if(answer.equals("n")) {
						repeat=false;
					}
				
			
		}while(repeat);
		
	}
	public void updateContact() {
		
	}
	public void deleteContact() {
	
	}
}
