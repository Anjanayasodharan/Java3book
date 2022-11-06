import java.sql.*;
import java.util.Scanner;

public class Book {
    public static void main(String args[])
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
        }
        catch (Exception e){
            System.out.println(e);
        }
        int choice;
        String title,author,category;
        int charge;
        Scanner s= new Scanner(System.in);
        while(true){
            System.out.println("1.select any option");
            System.out.println("1.insert");
            System.out.println("2.select");
            System.out.println("3.search");
            System.out.println("4.update");
            System.out.println("5.delete");
            System.out.println("6.exit");
            System.out.println("enter the choice");
            choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("insertdata");

                    break;
                case 2:
                    System.out.println("select data");

                    break;
                case 3:
                    System.out.println("search data");

                    break;
                case 4:
                    System.out.println("update data");
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("exit");
                    System.exit(0);
                    break;
            }
        }
    }
}


