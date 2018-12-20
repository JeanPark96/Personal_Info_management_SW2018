public class ToDoList{
	String title;
    String create_date;
    String due;
    String description;
    
    public ToDoList(String title, String create_date, String due, String description) {
    	
    	if(title.matches("^[a-zA-Z]*$"))
    		setTitle(title);
		else 
			this.title = title;
    	
    	if(create_date.contains("/"))
			this.create_date = create_date;
		else 
			setCreate_date(create_date);
    	
    	this.due = due;
    	this.description = description;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		
    	title=title.toUpperCase();
		this.title = title;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		create_date=create_date.substring(0, 4)+"/"+create_date.substring(4, 6)+"/"+create_date.substring(6, 8)+"/"+create_date.substring(8,10);
		this.create_date = create_date;
	}

	public String getDue() {
		return due;
	}

	public void setDue(String due) {
		this.due = due;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}    
}
