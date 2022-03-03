package maven_demo;
//import java.util.Scanner;

import com.opencsv.bean.CsvBindByName;

public class Contestant {
	@CsvBindByName(column = "id")
	public int id;
	@CsvBindByName(column = "first_name")
	public String firstName;
	@CsvBindByName(column = "last_name")
	public String lastName;
	@CsvBindByName(column = "email")
	public String email;
	public Boolean winner;
	
	public Contestant() {
		
	}

	public Contestant(int id, String firstName, String lastName, String email, Boolean winner) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setWinner(winner);
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

	public Boolean getWinner() {
		return winner;
	}

	public void setWinner(Boolean winner) {
		this.winner = winner;
	}
	
// 	Sample with user input
	//	public void setName() {
	//	System.out.println("Please enter first name: ");
	//	Scanner scanner = new Scanner(System.in);
	//	firstName = scanner.nextLine();
	//	
	//	System.out.println("Please enter last name: ");
	//	lastName = scanner.nextLine();
	//}
	//
	//public void setEmail() {
	//	System.out.println("Please enter your email address: ");
	//	Scanner scanner = new Scanner(System.in);
	//	email = scanner.nextLine();
	//}
	}
