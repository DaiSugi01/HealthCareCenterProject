package healthCareCenter;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		// ask user to enter d or p
		
		// loop through until user input q
		while (true) {
			
			if () {
				// for Doctor
				
				// ask to enter the doctor id
				
				// print out appointment list
				
			} else {
				// for Patient
				
				// ask to enter the patient id
				
				// ask the date and time for the appointment
				
				// ask to enter the doctor id
				
				// add this appointment to list of appointments of the doctor
				
				// print the information of their appointment.
				System.out.println("Your Appointment is on " + "OCT 31 2020 12:30" + "with " + 
						"doctors full name" + ".");			
			}
			
			// ask user to continue or quit
			System.out.print("Please input c to continue, or q to quit");
			
			// take user input here
			
			// if user type q, break this loop, otherwise, go to next loop
			if () {
				break;
			}
		}
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
