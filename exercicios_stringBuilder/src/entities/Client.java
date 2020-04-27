package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String Name;
	private String Email;
	private Date BirthDate;
	
	public Client(String name, String email, Date birthDate) {
		Name = name;
		Email = email;
		BirthDate = birthDate;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return Name + "(" + sdf.format(BirthDate) + ") - " + Email;
	}
}
