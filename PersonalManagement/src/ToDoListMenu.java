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
        System.out.println("To Do List를 생성합니다."); 
        createToDoList();
        break;
     case 2:
        System.out.println("To Do List를 보여줍니다.");
        viewToDoList();
        break;
     case 3: 
        System.out.println("To Do List를 갱신합니다.");
        updateToDoList();
        break;
     case 4:
        System.out.println("To Do List를 삭제합니다.");
        deleteToDoList();
        break;
     case 5:
        System.out.println("Main Menu로 돌아갑니다.");
        return -1;
     }
     
     return 0;
  }
        
  public void createToDoList() {
	   Scanner scanner = new Scanner(System.in);
	   inputToDoList = new HashMap<Integer, ToDoList>();
	   boolean repeat = true;
	   do {
		   System.out.println("To Do List를 생성합니다.");
		   System.out.print("To Do List 제목 ");
		   String title = scanner.nextLine();
		   System.out.print("생성 날짜(년/월/일/시): ");
		   String create_date = scanner.nextLine();
		   System.out.print("마감날짜: ");
		   String due = scanner.nextLine();
		   System.out.print("설명: ");
		   String description=scanner.nextLine();
		   inputToDoList.put(++todolist_id, new ToDoList(title, create_date, due, description));
		   System.out.print("추가 입력 하시겠습니까?(y/n): ");
		   String answer=scanner.nextLine();
		   if(answer.equals("n")) {
			   repeat=false;
		   }
	   }while(repeat);
  }
  
  public void viewToDoList() {
	   System.out.println("==================================================");
	   System.out.println("id \t\t 제목 \t\t 생성날짜 \t\t 마감일 \t\t 설명");
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
		   System.out.print("수정할 id 입력: ");
		   int id = scanner.nextInt();
		   System.out.print("To Do List 제목: ");
		   String title = scanner.nextLine();
		   System.out.print("생성날짜(년/월/일/시): ");
		   String create_date = scanner.nextLine();
		   System.out.print("마감날짜: ");
		   String due = scanner.nextLine();
		   System.out.print("설명: ");
		   String description=scanner.nextLine();
		   
		   inputToDoList.put(id, new ToDoList(title, create_date, due, description));
		   
		   System.out.print("추가 수정하시겠습니까?(y/n)");
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
		  System.out.print("삭제할 id입력: ");
		  int id = scanner_id.nextInt();
		  inputToDoList.remove(id);
			   
		  System.out.print("추가 삭제하시겠습니까?(y/n)");
		  String answer=scanner_repeat.nextLine();
		  if(answer.equals("n")) {
			  repeat=false;
			  
		  }
	  }while(repeat);  
  }
  
}


