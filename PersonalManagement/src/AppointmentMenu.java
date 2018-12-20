import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AppointmentMenu {
	int appointment_id = 0;
	public static HashMap<Integer, Appointment> inputAppointment;
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
		   Scanner scanner = new Scanner(System.in);
		   inputAppointment = new HashMap<Integer, Appointment>();
		   boolean repeat = true;
		   do {
			   
			   inputAppointment.put(++appointment_id, addAppointmentInfo());
			   
			   System.out.print("추가 입력 하시겠습니까?(y/n): ");
			   String answer=scanner.nextLine();
			   if(answer.equals("n")) {
				   repeat=false;
			   }
		   }while(repeat);
	   }
	   
	   public Appointment addAppointmentInfo() {
		   Scanner scanner = new Scanner(System.in);
		   
		   System.out.println("일정을 입력해주세요.");
		   System.out.print("날짜(년/월/일): ");
		   String date = scanner.nextLine();
		   System.out.print("사람: ");
		   String person = scanner.nextLine();
		   System.out.print("장소: ");
		   String location = scanner.nextLine();
		   Appointment appointment=new Appointment(date,person,location);
			
			return appointment;
		   
	   }
	   public void viewAppointment() {
		   System.out.println("==================================================");
		   System.out.println("id 날짜 \t\t 사람 \t 장소\t");
		   System.out.println("==================================================");
		   
		   Set<Integer>keys = inputAppointment.keySet();
		   Iterator<Integer>iterate = keys.iterator();
		   while(iterate.hasNext()){
			   Integer id = iterate.next();
			   Appointment appointment = inputAppointment.get(id);
			   if(appointment!=null&&id!=null)
				   System.out.println(id+" "+appointment.getDate()+"\t"+appointment.getPerson()+"\t"+appointment.getLocation());
		   }
	      
	   }
	   
	   public void updateAppointment() {
		   boolean repeat = true;
		   do{
			   Scanner scanner = new Scanner(System.in);
			   System.out.print("수정할 id 입력: ");
			   int id = scanner.nextInt();
			   System.out.print("날짜(년/월/일): ");
			   String date = scanner.next();
			   System.out.print("사람: ");
			   String person = scanner.next();
			   System.out.print("장소: ");
			   String location = scanner.next();
			   inputAppointment.put(id, new Appointment(date, person, location));
			   
			   System.out.print("추가 수정하시겠습니까?(y/n)");
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
			   System.out.print("삭제할 id 입력: ");
			   int id = scanner.nextInt();
			   inputAppointment.remove(id);
			   
			   System.out.print("추가 삭제하시겠습니까?(y/n)");
			   String answer=scanner.next();
			   if(answer.equals("n")) {
				   repeat=false;
			   }
		   }while(repeat);
	      
	   }
}
