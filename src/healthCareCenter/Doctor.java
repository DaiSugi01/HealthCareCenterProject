package healthCareCenter;

import java.util.ArrayList;
import java.util.Objects;

public class Doctor extends User {
	
	private static int UNIQUE_ID = 1000;
	
	private int doctorId;
	private String specialty;
	private ArrayList<Appointment> appointments;
	
	public Doctor(String firstName, String lastName, String phoneNumber, String email, String specialty) {
		super(firstName, lastName, phoneNumber, email);
		setDoctorId();
		setSpecialty(specialty);
		this.appointments = new ArrayList<>();
	}

	/**
	 * add given appointments to array list
	 * @param appointment
	 */
	public void addAppointment(Appointment appointment) {
		this.appointments.add(appointment);
	}
	
	/**
	 * @return doctor id
	 */
	public int getDoctorId() {
		return doctorId;
	}
	
	private void setDoctorId() {
		if (UNIQUE_ID <= 100000) {
			this.doctorId = UNIQUE_ID++;
		} else {
			System.err.println("We cannot create user anymore");
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
			System.err.println("Spacialty should not be null. For default value, it is sat Unknown");
			this.specialty = "Unknown";			
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
	
	@Override
	public String toString() {
		return "Doctor ID: " + doctorId +
				super.toString() +
				"\nSpecialty: " + specialty;
	}
		
}
