package healthCareCenter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Daiki & Marina Braholka
 */
public class Driver {

	public static void main(String[] args) {
		
		// Doctors and Patients
		Patient p1 = new Patient("Allan", "Smith", "888888", "alan@gmail.com", LocalDate.of(1997, 4, 12), "male"); 
		Patient p2 = new Patient("Ross", "Geller", "888889", "ross@gmail.com", LocalDate.of(1990, 5, 25), "male");
		Patient p3 = new Patient("Chandler", "Bing", "888887", "bing@gmail.com", LocalDate.of(2000, 5, 11), "male");
		Patient p4 = new Patient("Rachel", "Green", "888588", "green@gmail.com", LocalDate.of(1990, 8, 25), "female");
		Patient p5 = new Patient("Monica", "Geller", "888788", "monica@gmail.com", LocalDate.of(1988, 5, 13), "female");
		Patient p6 = new Patient("Phoebe", "Buffay", "988888", "phoebe@gmail.com", LocalDate.of(1987, 9, 25), "female");
		Patient p7 = new Patient("Joey", "Tribiani", "688888", "joey@gmail.com", LocalDate.of(1991, 4, 25), "male");
		Patient p8 = new Patient("Gunther", "Stuart", "688888", "gunther@gmail.com", LocalDate.of(1991, 4, 25), "fluid");
		Patient p9 = new Patient("Allan", "Smith", "888888", "alan@gmail.com", LocalDate.of(1977, 3, 25), "non-binary");
		Patient p10= new Patient("Melissa", "Parker", "865888", "melissa@gmail.com", LocalDate.of(1995, 4, 25), "female");

		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		patients.add(p4);
		patients.add(p5);
		patients.add(p6);
		patients.add(p7);
		patients.add(p8);
		patients.add(p9);
		patients.add(p10);
		
		Doctor d1 = new Doctor("Marina", "Braholka", "1111111", "marina@gmail.com", "ANESTHESIOLOGY");
		Doctor d2 = new Doctor("Daiki", "Sugihara", "1111111", "daiki@gmail.com", "ALLERGY");
		Doctor d3 = new Doctor("Aidan", "Middleton", "1111111", "aidan@gmail.com", "DERMATOLOGY");
		Doctor d4 = new Doctor("Zhaleh", "Sojoodi", "1111111", "zhaleh@gmail.com", "DIAGNOSTIC RADIOLOGY");
		
		System.out.println(p1);
		System.out.println();
		System.out.println(d1);
		
		ArrayList<Doctor> doctors = new ArrayList<>();
		Appointment a1 = new Appointment(p1, LocalDateTime.of(2020, 11, 1, 11, 30));
		Appointment a2 = new Appointment(p2, LocalDateTime.of(2020, 12, 2, 22, 40));
		
		d1.addAppointment(a1);
		d1.addAppointment(a2);
		doctors.add(d1);
		doctors.add(d2);
		doctors.add(d3);
		doctors.add(d4);
		
		// ask user to enter d or p
		String user = getUser();
					
		if (user.equalsIgnoreCase("d")) {
			// for Doctor
			
			// ask user to enter the doctor id to get doctor object
			Doctor doctor = findDoctor(doctors);
			
			// print out appointment list
			printAppointmentInfo(doctor.getAppointments());
			
		} else {
			// for Patient
			
			// ask user to enter the patient id
			Patient patient = findPatient(patients);
			
			// ask the date and time for the appointment
			Appointment newAppointment =  makeNewAppointment(patient);
			
			// ask user to enter the doctor id
			Doctor doctor = findDoctor(doctors);
			
			// add this appointment to list of appointments of the doctor
			doctor.addAppointment(newAppointment);
			
			// print the information of their appointment.
			System.out.println("Your Appointment is on " + newAppointment.getAppointmentDate() + 
					" with " + doctor.getFullName() + ".");			
		}
		
	}
	
	/**
	 * @param patient
	 * @return new appointment object
	 */
	public static Appointment makeNewAppointment(Patient patient) {
		Scanner input = new Scanner(System.in);
		System.out.println("When is your appointment?: ");
		int year = checkYear();
		int month = checkMonth();
		int day = checkDay(year, month);		
		int hour = checkHour();
		int minutes = checkMinutes();

		return new Appointment(patient, LocalDateTime.of(year, month, day, hour, minutes));
		
	}
	
	/**
	 * @return year
	 */
	public static int checkYear() {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Year: ");
			int year = input.nextInt();
			
			if (year > 0) {
				return year;
			} else {
				System.err.println("Year should be more than 0. Please enter again.");
			}
		}
	}
	
	/**
	 * @return month
	 */
	public static int checkMonth() {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Month: ");
			int month = input.nextInt();
			
			if (month >= 1 && month <= 12) {
				return month;
			} else {
				System.err.println("Month should be between 1 and 12. Please enter again.");
			}
		}
	}
	
	/**
	 * @return Day
	 */
	public static int checkDay(int year, int month) {
		
        GregorianCalendar cal = (GregorianCalendar)Calendar.getInstance();
		int maxDay;
		
		switch (month) {
		case 2:
			if (cal.isLeapYear(year)) {
				maxDay = 29;
			} else {
				maxDay = 28;
			}
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			maxDay = 31;
			break;
		default:
			maxDay = 30;
		}
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Day: ");
			int day = input.nextInt();
			if (day >= 1 && day <= maxDay) {	
				return day;
			} else {
				System.err.println("Day should be between 1 and " + maxDay + ". Please enter again.");
			}
		}
	}
	
	/**
	 * @return Hour
	 */
	public static int checkHour() {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Hour: ");
			int hour = input.nextInt();
			
			if (hour >= 0 && hour <= 23) {
				return hour;
			} else {
				System.err.println("Hour should be between 0 and 23. Please enter again.");
			}
		}
	}
	
	/**
	 * @return Minutes
	 */
	public static int checkMinutes() {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Minutes: ");
			int minutes = input.nextInt();
			
			if (minutes >= 0 && minutes <= 59) {
				return minutes;
			} else {
				System.err.println("Minutes should be between 0 and 59. Please enter again.");
			}
		}
	}
	
	/**
	 * @return doctor or patient id
	 */
	public static Patient findPatient(ArrayList<Patient> patients) {
		Scanner input = new Scanner(System.in);
		
		Patient foundPatient = null;
		
		while (Objects.isNull(foundPatient)) {
			System.out.print("Please enter the patient id: ");
			int id = input.nextInt();		
			for (Patient patient : patients) {
				if (id == patient.getPatientID()) {
					return patient;
				}
			}
			
			System.err.println("There is such patient id. please enter again.");	
		}
		return foundPatient;
	}
	
	/**
	 * @return doctor or patient id
	 */
	public static Doctor findDoctor(ArrayList<Doctor> doctors) {
		Scanner input = new Scanner(System.in);
		
		Doctor foundDoctor = null;
		
		while (Objects.isNull(foundDoctor)) {
			System.out.print("Please enter the doctor id: ");
			int id = input.nextInt();		
			for (Doctor doctor : doctors) {
				if (id == doctor.getDoctorId()) {
					return doctor;
				}
			}
			
			System.err.println("There is such doctor id. please enter again.");	
		}
		return foundDoctor;
	}
		

	/**
	 * @return d for doctor or p for patient
	 */
	public static String getUser() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter d for Doctor, or p for Patient: ");
		String userInput = input.nextLine();
		
		while (!userInput.equalsIgnoreCase("d") && !userInput.equalsIgnoreCase("p")) {
			System.err.println("Wrong input. please enter again.");
			System.out.println("Please enter d for Doctor, or p for Patient: ");
			userInput = input.nextLine();
		}
		return userInput;
	}
	
	/**
	 * print out appointment information
	 * @param appointments
	 */
	public static void printAppointmentInfo(ArrayList<Appointment> appointments) {
		
		if (appointments.isEmpty()) {
			System.out.println("There is no appointment.");
			return;
		}
		
		for (Appointment appointment : appointments) {
			System.out.println(appointment);
		}
		
	}
	
}
