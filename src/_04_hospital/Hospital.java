package _04_hospital;

import java.util.ArrayList;

public class Hospital {
ArrayList<Patient> patients = new ArrayList<Patient>();
ArrayList<Doctor> doctors = new ArrayList<Doctor>();
public void addDoctor(Doctor d) {
	doctors.add(d);
}
public void addPatient(Patient p) {
	patients.add(p);
}
public ArrayList<Doctor> getDoctors() {
	return doctors;
}
public ArrayList<Patient> getPatients(){
	return patients;
}
public void assignPatientsToDoctors() {
	for (int i = 0; i < doctors.size(); i++) {
		for (int j = 0; j < patients.size(); j++) {
		if(doctors.get(i).getPatients().size()==3) {
			continue;
		}else {
			try {
				doctors.get(i).assignPatient(patients.get(j));
			} catch (DoctorFullException e) {System.out.println("doctor full, find help elsewhere :C");}
		}
	}
	}
}
}
