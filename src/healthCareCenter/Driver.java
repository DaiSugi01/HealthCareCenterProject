package healthCareCenter;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
	}

	/**
	 * print out appointment information
	 * @param appointments
	 */
	public static void printAppointmentInfo(ArrayList<Appointment> appointments) {
		for (Appointment appointment : appointments) {
			System.out.println(appointment);
		}
		
	}
	
}
