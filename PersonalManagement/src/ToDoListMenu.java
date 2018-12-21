import java.util.*;

public class ToDoListMenu {
	int todolist_id = 0;
	public static HashMap<Integer, ToDoList> inputToDoList;
	
	public void doList(){
		boolean repeat = true;
		Scanner scanner = new Scanner(System.in);
		do {
	      System.out.println("===========================");
	      System.out.println("1. Create To Do List");
	      System.out.println("2. View To Do List");
	      System.out.println("3. Update To Do List");
	      System.out.println("4. Delete To Do List");
	      System.out.println("5. Back to the Main Menu");
	      System.out.println("===========================\n");
	      System.out.print("Enter Menu Number: ");
	      
	      int selectnum = scanner.nextInt();
	      int receive_num = inputToDoMenuNum(selectnum);
	     
	      if(receive_num == -1) {
	    	  	repeat=false;
	      }
	      
		}while(repeat);
     
  }
  
  public int inputToDoMenuNum(int input) {
     
     switch(input) {
     case 1:
        createToDoList();
        break;
     case 2:
        viewToDoList();
        break;
     case 3: 
        updateToDoList();
        break;
     case 4:
        deleteToDoList();
        break;
     case 5:
        return -1;
     default:
			System.out.println("Wrong number input.");
			break;
     }
     
     return 0;
  }
        
  public void createToDoList() {
	   Scanner scanner = new Scanner(System.in);
	   inputToDoList = new HashMap<Integer, ToDoList>();
	   boolean repeat = true;
	   do {
		   System.out.print("To Do List title: ");
		   String title = scanner.nextLine();
		   System.out.print("creation date(yyyy/mm/dd/hh): ");
		   String create_date = scanner.nextLine();
		   System.out.print("due(yyyy/mm/dd): ");
		   String due = scanner.nextLine();
		   System.out.print("description: ");
		   String description=scanner.nextLine();
		   
		   inputToDoList.put(++todolist_id, addToDoListInfo(title, create_date, due, description));
		   
		   System.out.print("continue?(y/n): ");
		   String answer=scanner.nextLine();
		   if(answer.equals("n")) {
			   repeat=false;
		   }
	   }while(repeat);
  }
  
  public void viewToDoList() {
	   System.out.println("==================================================");
	   System.out.println("ID TITLE \t\t CREATION DATE \t\t DUE \t\t DESCRIPTION");
	   System.out.println("==================================================");
	   
	   Set<Integer>keys = inputToDoList.keySet();
	   Iterator<Integer>iterate = keys.iterator();
	   while(iterate.hasNext()){
		   Integer id = iterate.next();
		   ToDoList todolist = inputToDoList.get(id);
		   if(todolist!=null && id!=null)
			   System.out.println(id+"  "+todolist.getTitle()+"\t\t"+ todolist.getCreate_date()+"\t\t"+todolist.getDue()+"\t\t"+ todolist.getDescription());
	   }  
  }

  public ToDoList addToDoListInfo(String title,String create_date,String due,String description) {	
	  ToDoList todolist=new ToDoList(title,create_date,due,description);	
	  return todolist;
  }

  public void updateToDoList() {
	   boolean repeat = true;
	   Scanner scanner = new Scanner(System.in);
	   Scanner scanner2 = new Scanner(System.in);
	  
	   do{
		   System.out.print("[ID search]: ");
		   int id = scanner2.nextInt();
		   
		   System.out.print("To Do List title: ");
		   String title = scanner.nextLine();
		   System.out.print("creation date(yyyy/mm/dd/hh): ");
		   String create_date = scanner.nextLine();
		   System.out.print("due(yyyy/mm/dd): ");
		   String due = scanner.nextLine();
		   System.out.print("description: ");
		   String description = scanner.nextLine();
		   
		   updateToDoListInfo(id, title, create_date, due, description);
		   
		   System.out.print("continue?(y/n): ");
		   String answer = scanner.nextLine();
		   if(answer.equals("n")) {
			   repeat = false;
		   }
	   }while(repeat);
  }
  
  public ToDoList updateToDoListInfo(int input_id, String title, String create_date, String due, String description) {
	  ToDoList todolist=new ToDoList(title, create_date, due, description);
	  inputToDoList.put(input_id, todolist);
	  ToDoList t=inputToDoList.get(input_id);
	  
	  return t;
  }
  
  public void deleteToDoList() {
	  Scanner scanner_id = new Scanner(System.in);
	  Scanner scanner_repeat = new Scanner(System.in);
	  boolean repeat = true;
	  
	  do {
		  System.out.print("[ID search]: ");
		  int id = scanner_id.nextInt();
		  inputToDoList.remove(id);
			   
		  System.out.print("continue?(y/n): ");
		  String answer = scanner_repeat.nextLine();
		  if(answer.equals("n")) {
			  repeat = false;  
		  }
	  }while(repeat);  
  }
}