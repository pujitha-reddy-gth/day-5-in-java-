public class Reservation{
public String getReservationDetails(String hotelname, String questName, int nights){
return "Hotel Name:"+ hotelname+"\nGuest Name:"+questName +"\nNights:"+nights;
}

public static void main(String[] args){
Reservation reservation =new Reservation();
System.out.println(reservation.getReservationDetails("Grand Palace","David",3));
System.out.println(reservation.getReservationDetails("Grand Palace","Maria",2));
}
}
