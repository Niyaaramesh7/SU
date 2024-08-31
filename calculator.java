import java.util.Scanner;

public class calculator{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter 1st number:");
     double num1=sc.nextInt();
     System.out.println("enter 2nd number:");
     int num2=sc.nextInt();
     System.out.println("Choose an operation:");
     System.out.println("1. Addition");
     System.out.println("2. Subtraction");
     System.out.println("3. Multiplication");
     System.out.println("4. Division");
     int choice = sc.nextInt();
     double result;
      switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
                break;
        }
        sc.close();
     }
}
