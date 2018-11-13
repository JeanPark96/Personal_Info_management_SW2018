import java.util.Scanner;

public class AppointmentMenu {
	public void PrintMenu() {
	      System.out.println("---------------------------");
	      System.out.println("1. Create Appointment");
	      System.out.println("2. View Appointment");
	      System.out.println("3. Update Appointment");
	      System.out.println("4. Delete Appointment");
	      System.out.println("5. Back to main menu");
	      System.out.println("---------------------------");
	      
	   }
	   
	   public void appointmentList() {
		   boolean repeat=true;
		   do {
		      PrintMenu();
		      Scanner scanner = new Scanner(System.in);
		      int num = scanner.nextInt();
		      int receive_num=inputAppointmentMenuNum(num);
		      
		      if(receive_num==-1) {
		    	  	repeat=false;
		      }
		      scanner.close();
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
		   }
		   
		   return 0;
	   }
	   public void createAppointment() {
	      
	   }
	   
	   public void viewAppointment() {
	      
	   }
	   public void updateAppointment() {
	      
	   }
	   public void deleteAppointment() {
	      
	   }
}
