import java.util.Scanner;


public class MainMenu {
	
	public static void main(String args[]) {
		boolean repeat=true;
		do {
			MainMenu menu=new MainMenu();
			menu.showMenu();
			Scanner scanner=new Scanner(System.in);
			int input= scanner.nextInt();
			int receive_num=menu.callFeature(input);
			if(receive_num==-1) {
				repeat=false;
			}
			scanner.close();
		}while(repeat);
		
	}
	public void showMenu() {
		System.out.println("======================");
		System.out.println("1. Manage Contact");
		System.out.println("2. Appointment");
		System.out.println("3. To do List");
		System.out.println("4. Exit");
		System.out.println("======================");
		System.out.print("Enter menu number: ");
	}
	
	public int callFeature(int input) {
		switch(input) {
		case 1:
			ContactMenu contact=new ContactMenu();
			contact.contactList();
			break;
		case 2:
			AppointmentMenu appointment=new AppointmentMenu();
			appointment.appointmentList();
			break;
		case 3:
			ToDoListMenu toDoList=new ToDoListMenu();
			toDoList.doList();
			break;
		case 4:
			return -1;
		}
		return 0;
	}
}
