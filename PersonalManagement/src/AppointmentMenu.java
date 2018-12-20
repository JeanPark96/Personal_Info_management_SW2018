import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AppointmentMenu {
	int appointment_id = 0;
	public static HashMap<Integer, Appointment> inputAppointment;
	
	public void PrintMenu() {
	      System.out.println("===========================");
	      System.out.println("1. Create Appointment");
	      System.out.println("2. View Appointment");
	      System.out.println("3. Update Appointment");
	      System.out.println("4. Delete Appointment");
	      System.out.println("5. Back to main menu");
	      System.out.println("===========================\n");
	      System.out.print("Enter Menu Number: ");
	      
	   }
	   
	   public void appointmentList() {
		   boolean repeat = true;
		   do {
		      PrintMenu();
		      Scanner scanner = new Scanner(System.in);
		      int num = scanner.nextInt();
		      int receive_num = inputAppointmentMenuNum(num);
		      
		      if(receive_num == -1) {
		    	  	repeat = false;
		      }
		   }while(repeat);
	      
	   }
	   
	   public int inputAppointmentMenuNum(int input) {
		   switch(input) {
		   	case 1:
		   		createAppointment();
		   		break;
		   	case 2:
		   		viewAppointment();
		   		break;
		   	case 3:
		   		updateAppointment();
		   		break;
		   	case 4:
		   		deleteAppointment();
		   		break;
		   	case 5:
		   		return -1;
		   	default:
				System.out.println("Wrong number input.");
				break;
		   }
		   
		   return 0;
	   }
	   
	   public void createAppointment() {
		   Scanner scanner = new Scanner(System.in);
		   inputAppointment = new HashMap<Integer, Appointment>();
		   boolean repeat = true;
		   do {
			   System.out.println("Enter your date.");
			   System.out.print("date(yyyy/mm/dd): ");
			   String date = scanner.nextLine();
			   System.out.print("person: ");
			   String person = scanner.nextLine();
			   System.out.print("location: ");
			   String location = scanner.nextLine();
			   inputAppointment.put(++appointment_id, addAppointmentInfo(date, person, location));
			   
			   System.out.print("continue?(y/n): ");
			   String answer=scanner.nextLine();
			   if(answer.equals("n")) {
				   repeat=false;
			   }
		   }while(repeat);
	   }
	   
	   public Appointment addAppointmentInfo(String date, String person, String location) {
		   Appointment appointment = new Appointment(date, person, location);
		   return appointment;   
	   }
	   
	   public void viewAppointment() {
		   System.out.println("==================================================");
		   System.out.println("ID DATE \t PERSON \t LOCATION\t");
		   System.out.println("==================================================");
		   
		   Set<Integer>keys = inputAppointment.keySet();
		   Iterator<Integer>iterate = keys.iterator();
		   while(iterate.hasNext()){
			   Integer id = iterate.next();
			   Appointment appointment = inputAppointment.get(id);
			   if(appointment!=null && id!=null)
				   System.out.println(id+"  "+appointment.getDate()+"\t"+appointment.getPerson()+"\t"+appointment.getLocation());
		   }
	      
	   }
	   
	   public void updateAppointment() {
		   boolean repeat = true;
		   do{
			   Scanner scanner = new Scanner(System.in);
			   System.out.print("[ID search]: ");
			   int id = scanner.nextInt();
			   System.out.print("date(yyyy/mm/dd): ");
			   String date = scanner.next();
			   System.out.print("person: ");
			   String person = scanner.next();
			   System.out.print("location: ");
			   String location = scanner.next();
			   inputAppointment.put(id, new Appointment(date, person, location));
			   
			   System.out.print("continue?(y/n): ");
			   String answer=scanner.next();
			   if(answer.equals("n")) {
				   repeat=false;
			   }
		   }while(repeat);
		   
	   }
	   
	   public void deleteAppointment() {
		   boolean repeat = true;
		   do {
			   Scanner scanner = new Scanner(System.in);
			   System.out.print("[ID search]: ");
			   int id = scanner.nextInt();
			   inputAppointment.remove(id);
			   
			   System.out.print("continue?(y/n): ");
			   String answer=scanner.next();
			   if(answer.equals("n")) {
				   repeat=false;
			   }
		   }while(repeat);
	      
	   }
}
