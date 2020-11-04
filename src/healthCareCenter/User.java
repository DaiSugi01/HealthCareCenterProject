package healthCareCenter;

import java.util.Objects;

public class User {

	private final String UNKNOWN = "Unknown";

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	public User(String firstName, String lastName, String phoneNumber, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
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
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (Objects.isNull(phoneNumber) || phoneNumber.isEmpty()) {
			System.err.println("Phone number should not be null. For default value, it is sat " + UNKNOWN);
			this.phoneNumber = UNKNOWN;			
		} else {
			this.phoneNumber = phoneNumber;
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
	 * @return full name (first name + last name)
	 */
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	@Override
	public String toString() {
		return "\nName: " + getFullName() + 
				"\nPhone Number: " + phoneNumber + 
				"\nEmail: " + email; 
	}
}
