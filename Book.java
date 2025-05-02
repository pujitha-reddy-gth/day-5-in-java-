public class Book{
public void displayInfo(String libraryName,String title,String author){
System.out.println("libraryName :"+libraryName);
System.out.println(" title :"+title);
System.out.println(" author  :"+author);
}
public static void main(String[] args){
Book books=new Book();
books.displayInfo("City Public Library", "The Great Gatsby", "F. Scott Fitzgerald");
books.displayInfo("F. Scott Fitzgerald","1984 ",": George Orwell");
}
}



