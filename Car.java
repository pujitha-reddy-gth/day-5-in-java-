public class Car{
public void displayDetails(String showroomName,String modelName,int price){
System.out.println("Showroom Name :"+showroomName);
System.out.println("model :"+modelName);
System.out.println("price :"+price);
}
public static void main(String[] args){
Car cars=new Car();
cars.displayDetails("Elite Motors", "Tesla Model S", 80000);
cars.displayDetails("Elite Motors"," BMW X5",75000);
}
}



