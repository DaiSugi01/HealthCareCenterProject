package healthCareCenter;

import java.time.LocalDateTime;
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
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
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
		return "Patient: " + "Imprement Here" +
				"\n\tAppointmen Date: " + appointmentDate;
	}
	
}
