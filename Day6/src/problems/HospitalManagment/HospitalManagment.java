package problems.HospitalManagment;

public class HospitalManagment {
    public static void main(String[] args) {
        Patient Inpatient=new Inpatient("BP8902","mahesh",2900,3400,9833);
        Patient OutPatient=new OutPatient("CP093","KUmar",4599,45263,9000);
        ((Patient.MedicalRecord) Inpatient).addRecord("Admitted for surgery, recovering well.");
        ((Patient.MedicalRecord) OutPatient).addRecord("Diagnosed with seasonal flu.");

        PatientManger patientManger=new PatientManger();
        patientManger.processPatient(Inpatient);
        patientManger.processPatient(OutPatient);



    }

}
/*
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.

 */