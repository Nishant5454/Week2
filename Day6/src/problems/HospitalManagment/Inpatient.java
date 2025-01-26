package problems.HospitalManagment;

class Inpatient extends Patient implements Patient.MedicalRecord {
    private int icuCharge;
    private int medicineCharge;
    private String medicalHistroy;
    Inpatient(String patientID,String patientName,int age,int icuCharge,int medicineCharge){
        super(patientID,patientName,age);
        this.icuCharge=icuCharge;
        this.medicineCharge=medicineCharge;
    }
    @Override
    public int calculateBill(){
        return icuCharge+medicineCharge;
    }
    @Override
    public void addRecord(String record){
        this.medicalHistroy=record;

    }
    @Override
    public String showRecord(){
       // System.out.println("The Record of the Patient is "+medicalHistroy);
        return "the History of the Patient is "+medicalHistroy;
    }


}
