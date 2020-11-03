package healthCareCenter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

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
		
		ArrayList<Doctor> doctors = new ArrayList<>();
		Appointment a1 = new Appointment(p1, LocalDateTime.of(2020, 11, 1, 11, 30));
		Appointment a2 = new Appointment(p2, LocalDateTime.of(2020, 12, 2, 22, 40));
		
		d1.addAppontment(a1);
		d1.addAppontment(a2);
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
			doctor.addAppontment(newAppointment);
			
			// print the information of their appointment.
			System.out.println("Your Appointment is on " + newAppointment.getAppointmentDate() + 
					" with " + doctor.getFullName() + ".");			
		}
		
	}
	
	public static Appointment makeNewAppointment(Patient patient) {
		Scanner input = new Scanner(System.in);
		System.out.println("When is your appointment?");
		System.out.print("Year: ");
		int year = input.nextInt();
		System.out.print("Month: ");
		int month = input.nextInt();
		System.out.print("Date: ");
		int day = input.nextInt();
		System.out.print("Hour: ");
		int hour = input.nextInt();
		System.out.print("Minutes: ");
		int minutes = input.nextInt();
		
		return new Appointment(patient, LocalDateTime.of(year, month, day, hour, minutes));
		
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
		for (Appointment appointment : appointments) {
			System.out.println(appointment);
		}
		
	}
	
}
