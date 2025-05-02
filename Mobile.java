public class Mobile{
public void showDetails(String storeName ,String brand ,int price){
System.out.println("storeName:"+storeName);
System.out.println(" brand:"+brand);
System.out.println(" price:"+ price);
}
public static void main(String[] args){
Mobile mobiles=new Mobile();
mobiles.showDetails("Tech World", "Apple", 1200);
mobiles.showDetails("Tech World","Samsung",1900);
}
}

