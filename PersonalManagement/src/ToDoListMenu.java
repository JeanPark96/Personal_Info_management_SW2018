import java.util.Scanner;

public class ToDoListMenu {
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
        System.out.println("to do list를 생성합니다.");
        createToDoList();
        break;
     case 2:
        System.out.println("to do list를 보여줍니다.");
        viewToDoList();
        break;
     case 3: 
        System.out.println("to do list를 수정합니다.");
        updateToDoList();
        break;
     case 4:
        System.out.println("to do list를 삭제합니다.");
        deleteToDoList();
        break;
     case 5:
        System.out.println("Main Menu로 돌아갑니다.");
        return -1;
     }
     
     return 0;
  }
        
  public void createToDoList() {
           
  }      
  public void viewToDoList() {
           
  }
  public void updateToDoList() {
           
  }
  public void deleteToDoList() {
     
  }   
}
