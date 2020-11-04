package healthCareCenter;

import java.time.LocalDate;

public class Patient {
	
	private static int UNIQUE_ID = 1000;
	private int patientID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	private LocalDate dateOfBirth;
	private String gender;


	public Patient(String firstName, String lastName, String phoneNum, String email, LocalDate dateOfBirth, String gender) {
		this.patientID = UNIQUE_ID++;
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setEmail(email);
		setDateOfBirth(dateOfBirth);
		setGender(gender);
	
}

	public int getPatientID() {
		return patientID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	

	public void setFirstName(String firstName) {
		if(firstName.isEmpty() || firstName.equalsIgnoreCase("")) {
			this.firstName = "Unknown";
		} else {
			this.firstName = firstName;
		}

	}
	

	public void setLastName(String lastName) {
		if(lastName.isEmpty() || lastName.equalsIgnoreCase("")) {
			this.lastName = "Unknown";
		} else {
			this.lastName = lastName;
		}

	}


	public void setPhoneNum(String phoneNum) {
		if(phoneNum.isEmpty() || phoneNum.equalsIgnoreCase("")) {
			this.phoneNum = "Unknown";
		} else {
			this.phoneNum = phoneNum;
		}
	}

	
	public void setEmail(String email) {
		if(email.isEmpty() || email.equalsIgnoreCase("")) {
			this.email = "Unknown";
		} else {
			this.email = email;
		}
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public void setGender(String gender) {
		if(gender.isEmpty() || gender.equalsIgnoreCase("")) {
			this.gender = "Unknown";
		} else {
			this.gender = gender;
		}
	}
	
	
	public String toString() {
		return "Name : " + getFirstName() + " " + getLastName() +
				"\nEmail : " + getEmail() + 
				"\nDateOfBirth : " + getDateOfBirth();
	}


}