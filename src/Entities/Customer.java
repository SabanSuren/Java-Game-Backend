package Entities;

import Abstract.Entitiy;

public class Customer implements Entitiy{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userName;
	private String nationalId;
	private int birdDate;
	
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, String email, String password, String userName,
			String nationalId, int birdDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.nationalId = nationalId;
		this.birdDate = birdDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getBirdDate() {
		return birdDate;
	}
	public void setBirdDate(int birdDate) {
		this.birdDate = birdDate;
	}

}
