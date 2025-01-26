package problems.HospitalManagment;
 abstract  class Patient {
     private String patientId;
     private String patientName;
     private int age;
     Patient(String patientId,String patientName,int age){
         this.patientId=patientId;
         this.patientName=patientName;
         this.age=age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getAge() {
         return age;
     }

     public void setPatientName(String patientName) {
         this.patientName = patientName;
     }

     public String getPatientName() {
         return patientName;
     }

     public void setPatientId(String patientId) {
         this.patientId = patientId;
     }

     public String getPatientId() {
         return patientId;
     }

     interface MedicalRecord{
         public void addRecord(String record);
         public String showRecord();

     }
     abstract public  int calculateBill();
     public String getPatientDetails(){
         return  "Patient id is "+patientId+"name of patient is "+patientName+" and the age of patient is "+age;
     }





}
