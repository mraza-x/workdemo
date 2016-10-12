
import java.util.Scanner;

/**
  Mohammed Raza
  CSC 162 - Lab3 #1 (main)
*/

public class WorkDemo
{
   public static void main(String[] args)
   {

	  String name1;
	  String id1;
	  String date1;
	  int shift1;
	  double payrate1;


	  Scanner keyboard = new Scanner(System.in);

	  //***Employee 1***

					System.out.println("Employee 1: ");

					System.out.print("Name: ");
      				name1 = keyboard.nextLine();

      				System.out.print("ID number: ");
      				id1 = keyboard.nextLine();

      				System.out.print("Hire Date: ");
      				date1 = keyboard.nextLine();

      				System.out.print("Shift (1 for day, 2 for night): ");
      				shift1 = keyboard.nextInt();

      				System.out.print("Pay Rate/Hour: $");
      				payrate1 = keyboard.nextDouble();

      ProductionWorker emp1 = new ProductionWorker(name1, id1, date1, shift1, payrate1);

 	  System.out.println(" ");
      System.out.println(" ");



      System.out.println("Name: " +
                         emp1.getName());

	  System.out.println("ID: " +
                         emp1.getEmployeeNumber());

	  System.out.println("Hire Date: " +
                         emp1.getHireDate());

      switch (emp1.getShift())
      {
		  case 1: System.out.println("Day Shift"); break;
		  case 2: System.out.println("Night Shift"); break;
		  default:System.out.println("Invalid Shift");
	  }

      System.out.println("Pay Rate/Hr: $" +
                         emp1.getPayRate());




   }
}
