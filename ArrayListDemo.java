import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo
{
   // ArrayList for storing book details
   private ArrayList<String> library;
   private String bookName;
   Scanner sc = new Scanner(System.in);

   // Create a library Constructor
   public ArrayListDemo()
   {
     library = new ArrayList<>();
   }
   public static void main(String[] args)
   {
     ArrayListDemo array = new ArrayListDemo();
     array.addBook();
     array.showListOfBook();
     array.removeBook();
     array.addItemAtPosition

   }

   public void addBook()
   {
       char a;
       do
       {
        sc = new Scanner(System.in);
        System.out.println("Enter Name Of Book");
        bookName = sc.nextLine();
        //System.out.println("Read from scaner "+bookName);
        library.add(bookName);
        System.out.println("Do You Want To Continue(Y/N)");
         a = sc.next().charAt(0);

      } while(a =='Y'|| a =='y');
  }

   public void showListOfBook(){
      int bookListSize = library.size();
      for(String bookName : library)
      {
        System.out.println("BookList Is :" + bookName);
      }

   }
   public void removeBook()
   { int index;
     System.out.println("Enter Index of Book to remove : " );
      index = sc.nextInt();

       if(index >= 0 && index < library.size())
        {
            library.remove(index);
            showListOfBook();
            System.out.println("Item remove sucessfully!!!!");
        }
        else // if(index > library.size())
        {
          System.out.println("Oops !!!!! Index Out Of Bound Exception...Please provide correct index");
        }
}
}
