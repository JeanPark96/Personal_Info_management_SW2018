public class ToDoList{
	String title;
    String create_date;
    String due;
    String description;
    
    public ToDoList(String title, String create_date, String due, String description) {
       this.title = title;
       this.create_date = create_date;
       this.due=due;
       this.description=description;
    }

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCreateDate() {
		return create_date;
	}
	
	public void setCreateDate(String person) {
		this.create_date = create_date;
	}
	
	public String getDue() {
		return due;
	}
	
	public String setDue(String due) {
		this.due=due;
	}
	
	public void getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	 
    
}
