

public class Appointment {
	String date;
	String person;
	String location;
	public Appointment(String date, String person, String location) {
		this.date = date;
		this.person=person;
	    this.location = location;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
	   
	   