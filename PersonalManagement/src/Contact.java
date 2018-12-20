import java.util.StringTokenizer;

class Contact {
	String name,phone_num,email;
	
	public Contact(String name,String phone_num, String email) {
		
		if(name.matches("^[ㄱ-ㅎ가-힣]*$"))
			this.name=name;
		else {
			if(!Character.isUpperCase(name.charAt(0)))
				setName(name);
		}
		
		if(phone_num.contains("-"))
			this.phone_num=phone_num;
		else 
			setPhone_num(phone_num);
		
		
		if(email.contains("@") && email.contains(".com"))
			this.email=email;
		else
			setEmail(email);
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name.substring(0, 1).toUpperCase()+name.substring(1, name.length());
		this.name = name ;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		phone_num=phone_num.substring(0, 3)+"-"+phone_num.substring(3, 7)+"-"+phone_num.substring(7, 11);
		this.phone_num=phone_num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}
	
}
