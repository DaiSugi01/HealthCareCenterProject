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


	public Patient(int patientID, String firstName, String lastName, String phoneNum, String email, LocalDate dateOfBirth, String gender) {
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
		if(firstName.isEmpty() || firstName.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return firstName;
		}
	}
	
	public String getLastName() {
		if(lastName.isEmpty() || lastName.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return lastName;
		}
	}

	public String getPhoneNum() {
		if(phoneNum.isEmpty() || phoneNum.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return phoneNum;
		}
	}

	public String getEmail() {
		if(email.isEmpty() || email.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return email;
		}
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getGender() {
		if(gender.isEmpty() || gender.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return gender;
		}
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Name : " + getFirstName() + " " + getLastName() +
				"\nEmail : " + getEmail() + 
				"\nDateOfBirth : " + getDateOfBirth();
	}


}