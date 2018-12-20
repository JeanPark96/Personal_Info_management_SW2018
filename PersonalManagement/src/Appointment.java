public class Appointment {
	String date;
	String person;
	String location;
	
	public Appointment(String date, String person, String location) {
		if(date.contains("/"))
			this.date = date;
		else 
			setDate(date);
		
		if(person.matches("^[A-Z]*$"))
			this.person=person;
		else 
			setPerson(person);
		
	    this.location = location;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		date = date.substring(0, 4)+"/"+date.substring(4, 6)+"/"+date.substring(6, 8);
		this.date = date;
	}
	
	public String getPerson() {
		return person;
	}
	
	public void setPerson(String person) {
		person = person.substring(0, 1).toUpperCase()+person.substring(1, person.length());
		this.person = person;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
	   
	   