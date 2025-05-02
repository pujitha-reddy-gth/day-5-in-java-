public class Faculty{
public void showFacultyDetails(String universityName,String facultyName,String department){
System.out.println("universityName:"+universityName);
System.out.println("facultyName:"+facultyName);
System.out.println("department:"+department);
}
public static void main(String[] args){
Faculty faculty=new Faculty();
faculty.showFacultyDetails("Stanford University", "Dr. Robert Brown","Computer Science");
faculty.showFacultyDetails("Stanford University","Dr. Lisa Green","Physics");
}
}
