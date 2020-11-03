package healthCareCenter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Appointment {

	private Patient patient;
	private LocalDateTime appointmentDate;

	public Appointment(Patient patient, LocalDateTime appointmentDate) {
		setPatient(patient);
		setAppointmentDate(appointmentDate);		
	}

	/**
	 * @return patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient
	 */
	public void setPatient(Patient patient) {
		if(Objects.nonNull(patient)) {
			this.patient = patient;
		}
	}

	/**
	 * @return appointment date
	 */
	public String getAppointmentDate() {
		LocalDateTime l1 = LocalDateTime.of(2020, 11, 1, 11, 30);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm");
		return l1.format(formatter);
	}

	/**
	 * @param appointmentDate
	 */
	public void setAppointmentDate(LocalDateTime appointmentDate) {
		if(Objects.nonNull(appointmentDate)) {
			this.appointmentDate = appointmentDate;
		}
	}
	
	@Override
	public String toString() {
		return "\nAppointmen Date: " + appointmentDate +
				"\nPatient Name: " + patient.getFirstName() +  " " + patient.getLastName();
				
	}
	
}
