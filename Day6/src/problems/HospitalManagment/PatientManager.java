package problems.HospitalManagment;
class PatientManger{
    public void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails());
        double bill = patient.calculateBill();

        if(patient instanceof Patient.MedicalRecord) {
            Patient.MedicalRecord record = (Patient.MedicalRecord) patient;
            System.out.println(record.showRecord());
        }

        System.out.println("Total Bill: " + bill);
    }
}