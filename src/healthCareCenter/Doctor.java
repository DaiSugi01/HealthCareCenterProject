package healthCareCenter;

import java.util.ArrayList;
import java.util.Objects;

public class Doctor {
	
	private static int UNIEQUE_ID = 1000;
	private final String UNKNOWN = "Unknown";
	
	private int doctorId;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String email;
	private String specialty;
	private ArrayList<Appointment> appointments;
	
	public Doctor(String firstName, String lastName, int phoneNumber, String email, String specialty) {
		this.doctorId = UNIEQUE_ID++;
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setSpecialty(specialty);
		this.appointments = new ArrayList<>();
	}

	/**
	 * add given appointments to array list
	 * @param appointment
	 */
	public void addAppontment(Appointment appointment) {
		this.appointments.add(appointment);
	}
	/**
	 * @return doctor id
	 */
	public int getDoctorId() {
		return doctorId;
	}
	
	/**
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (Objects.isNull(firstName) || firstName.isEmpty()) {
			System.err.println("First name should not be null. For default value, it is sat " + UNKNOWN);
			this.firstName = UNKNOWN;			
		} else {
			this.firstName = firstName;
		}
	}

	/**
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (Objects.isNull(lastName) || lastName.isEmpty()) {
			System.err.println("Last name should not be null. For default value, it is sat " + UNKNOWN);
			this.lastName = UNKNOWN;			
		} else {
			this.lastName = lastName;
		}
	}

	/**
	 * @return phone number
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 */
	public void setPhoneNumber(int phoneNumber) {
		if (phoneNumber > 0) {
			this.phoneNumber = phoneNumber;
		} else {
			System.err.println("Phone number should more than 0. For default value, it is sat " + 1);
			this.phoneNumber = 1;
		}
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		if (Objects.isNull(email) || email.isEmpty()) {
			System.err.println("Last name shouled not be null. For default value, it is sat " + UNKNOWN);
			this.email = UNKNOWN;			
		} else {
			this.email = email;
		}
	}

	/**
	 * @return specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty
	 */
	public void setSpecialty(String specialty) {
		if (Objects.isNull(specialty) || specialty.isEmpty()) {
			System.err.println("Spacialty should not be null. For default value, it is sat " + UNKNOWN);
			this.specialty = UNKNOWN;			
		} else {
			this.specialty = specialty;
		}
		this.specialty = specialty;
	}
	
	/**
	 * @return appointments list
	 */
	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}

	/**
	 * @return full name (first name + last name)
	 */
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	@Override
	public String toString() {
		return "Doctor ID: " + doctorId +
				"\n\tDoctor Name: " + getFullName() + 
				"\n\tPhone Number: " + phoneNumber + 
				"\n\tEmail: " + email + 
				"\n\tSpecialty: " + specialty;
	}
		
}
