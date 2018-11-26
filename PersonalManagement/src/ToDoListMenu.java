import java.util.*;

public class ToDoListMenu {
	int todolist_id = 0;
	public static HashMap<Integer, ToDoList> inputToDoList;
	
	
	public void doList(){
		boolean repeat=true;
		do {
	      System.out.println("=========================");
	      System.out.println("1. Create To Do List");
	      System.out.println("2. View To Do List");
	      System.out.println("3. Update To Do List");
	      System.out.println("4. Delete To Do List");
	      System.out.println("5. Back to the Main Menu");
	      System.out.println("=========================");
	      System.out.println("Select: ");  
	      Scanner scanner=new Scanner(System.in);
	      int selectnum=scanner.nextInt();
	      int receive_num=inputToDoMenuNum(selectnum);
	     
	      if(receive_num==-1) {
	    	  	repeat=false;
	      }
	      
	      scanner.close();
		}while(repeat);
     
  }
  
  public int inputToDoMenuNum(int input) {
     
     switch(input) {
     case 1:
        System.out.println("To Do List�� �����մϴ�."); 
        createToDoList();
        break;
     case 2:
        System.out.println("To Do List�� �����ݴϴ�.");
        viewToDoList();
        break;
     case 3: 
        System.out.println("To Do List�� �����մϴ�.");
        updateToDoList();
        break;
     case 4:
        System.out.println("To Do List�� �����մϴ�.");
        deleteToDoList();
        break;
     case 5:
        System.out.println("Main Menu�� ���ư��ϴ�.");
        return -1;
     }
     
     return 0;
  }
        
  public void createToDoList() {
	   Scanner scanner = new Scanner(System.in);
	   inputToDoList = new HashMap<Integer, ToDoList>();
	   boolean repeat = true;
	   do {
		   System.out.println("To Do List�� �����մϴ�.");
		   System.out.print("To Do List ���� ");
		   String title = scanner.nextLine();
		   System.out.print("���� ��¥(��/��/��/��): ");
		   String create_date = scanner.nextLine();
		   System.out.print("������¥: ");
		   String due = scanner.nextLine();
		   System.out.print("����: ");
		   String description=scanner.nextLine();
		   inputToDoList.put(++todolist_id, new ToDoList(title, create_date, due, description));
		   System.out.print("�߰� �Է� �Ͻðڽ��ϱ�?(y/n): ");
		   String answer=scanner.nextLine();
		   if(answer.equals("n")) {
			   repeat=false;
		   }
	   }while(repeat);
  }
  
  public void viewToDoList() {
	   System.out.println("==================================================");
	   System.out.println("id \t\t ���� \t\t ������¥ \t\t ������ \t\t ����");
	   System.out.println("==================================================");
	   
	   Set<Integer>keys = inputToDoList.keySet();
	   Iterator<Integer>iterate = keys.iterator();
	   while(iterate.hasNext()){
		   Integer id = iterate.next();
		   ToDoList todolist = inputToDoList.get(id);
		   if(todolist!=null&&id!=null)
			   System.out.println(id+" "+todolist.getTitle()+"\t"+ todolist.getCreateDate()+"\t"+todolist.getDue()+"\t"+ todolist.getDescription());
	   }
     
  }
  

  public void updateToDoList() {
	   boolean repeat = true;
	   do{
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("������ id �Է�: ");
		   int id = scanner.nextInt();
		   System.out.print("To Do List ����: ");
		   String title = scanner.nextLine();
		   System.out.print("������¥(��/��/��/��): ");
		   String create_date = scanner.nextLine();
		   System.out.print("������¥: ");
		   String due = scanner.nextLine();
		   System.out.print("����: ");
		   String description=scanner.nextLine();
		   
		   inputToDoList.put(id, new ToDoList(title, create_date, due, description));
		   
		   System.out.print("�߰� �����Ͻðڽ��ϱ�?(y/n)");
		   String answer=scanner.next();
		   if(answer.equals("n")) {
			   repeat=false;
		   }
	   }while(repeat);
  }
  
  
  public void deleteToDoList() {
	  Scanner scanner_id=new Scanner(System.in);
	  Scanner scanner_repeat=new Scanner(System.in);
	  boolean repeat = true;
	  do {
		  System.out.print("������ id�Է�: ");
		  int id = scanner_id.nextInt();
		  inputToDoList.remove(id);
			   
		  System.out.print("�߰� �����Ͻðڽ��ϱ�?(y/n)");
		  String answer=scanner_repeat.nextLine();
		  if(answer.equals("n")) {
			  repeat=false;
			  
		  }
	  }while(repeat);  
  }
  
}


