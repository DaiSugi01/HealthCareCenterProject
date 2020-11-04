package healthCareCenter;

import java.time.LocalDate;

public class Patient extends User {
	
	private static int UNIQUE_ID = 1000;

	private int patientID;
	private LocalDate dateOfBirth;
	private String gender;

	public Patient(String firstName, String lastName, String phoneNumber, String email,
			LocalDate dateOfBirth, String gender) {
		super(firstName, lastName, phoneNumber, email);
		setPatientID();
		setDateOfBirth(dateOfBirth);
		setGender(gender);
	}

	/**
	 * @return patient id
	 */
	public int getPatientID() {
		return patientID;
	}

	/**
	 * @return date of birth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param patientID
	 */
	private void setPatientID() {
		if (UNIQUE_ID <= 100000) {
			this.patientID = UNIQUE_ID++;
		} else {
			System.err.println("We cannot create user anymore");
		}
	}
	
	/**
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @param gender
	 */
	public void setGender(String gender) {
		if(gender.isEmpty() || gender.equalsIgnoreCase("")) {
			this.gender = "Unknown";
		} else {
			this.gender = gender;
		}
	}
	
	@Override
	public String toString() {
		return "Patient ID: " + patientID +
				super.toString() +
				"\nDate of Birth : " + getDateOfBirth();
	}
	
}