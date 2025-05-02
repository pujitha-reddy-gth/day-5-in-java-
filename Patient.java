public class Patient{
public void printDetails(String hospitalName ,String patientName ,int age){
System.out.println("hospitalName:"+hospitalName);
System.out.println(" patientName:"+patientName);
System.out.println(" age:"+ age);
}
public static void main(String[] args){
Patient patients=new Patient();
patients.printDetails("City Care Hospital", "John Doe", 45);
patients.printDetails("City Care Hospital",": Emma Watson",30);
}
}
