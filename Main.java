import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//  Q1 Write a program that checks the role of the user
        System.out.println("*************************");
        System.out.println("Welcome to  User Role Checker program ");
        System.out.print("Please enter your role :");
        String role = input.nextLine();
//      This 'if' statement checks if  user role is "admin", "superuser", or "user" , with method (ignoring uppercase/lowercase letters).
        if (role.equalsIgnoreCase("admin")) {
            System.out.println("Welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome superuser");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("Welcome user");
        } else { // if the user entered a role that is not "admin", "superuser", or "user".
            System.out.println("Please enter admin, superuser or user ");
        }
//  Q2 Take three numbers from the user and print the greatest number.
        System.out.println("*************************");
        System.out.println("Welcome to greatest number program ");
        System.out.print("Please enter 1st number :");
        int num_1st = input.nextInt();
        System.out.print("Please enter 2nd number :");
        int num_2nd = input.nextInt();
        System.out.print("Please enter 3rd number:");
        int num_3rd = input.nextInt();
//      This 'if' checks - if  "num_1st" is greater than or equal to "num_2nd" and num_3rd.
        if (num_1st >= num_2nd && num_1st >= num_3rd) {
            System.out.println(num_1st + " is the largest number.");
        }// This 'else if' checks - if "num_2nd" is greater than or equal to  "num_1st"  and  "num_3rd"
        else if (num_2nd >= num_1st && num_2nd >= num_3rd) {
            System.out.println(num_2nd + " is the largest number.");
        }// This 'else' runs if  "num_3rd" is  not  largest.
        else {
            System.out.println(num_3rd + " is the largest number.");
        }
//  Q 3 Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.
        System.out.println("*************************");
        System.out.println("Welcome to  Weekday Name Display Program");
        Random rand = new Random(); // // This line creates a Random object to random numbers.
        int randomNum = rand.nextInt(7) + 1; // This line creates a random number between 1 and 7 .
        System.out.println(" The number :" + randomNum);
//      This switch statement checks 'randomNum' and print day name.
        switch (randomNum) {
            case 1:
                System.out.println(" Day is Sunday ..");
                break;
            case 2:
                System.out.println(" Day is Monday ..");
                break;
            case 3:
                System.out.println(" Day is Tuesday ..");
                break;
            case 4:
                System.out.println(" Day is Wednesday ..");
                break;
            case 5:
                System.out.println(" Day is Thursday ..");
                break;
            case 6:
                System.out.println(" Day is Friday ..");
                break;
            case 7:
                System.out.println(" Day is Saturday ..");
                break;
        }
//  Q4  Write a program that takes a numeric score as input and prints  the corresponding letter grade using the following grading scale:
        System.out.println("*************************");
        System.out.println("Welcome to  Grade Display Program");
        System.out.print("Enter your numeric score :");
        int score = input.nextInt();
        System.out.println("Enter Numeric Score :" + score);
        if (score >= 90 && score <= 100) { // This 'if' statement checks - if the score is between 90 and 100
            System.out.println("Letter Grade is A");
        } else if (score >= 80 && score <= 89) { // This 'else if' checks - if the score is between 80 and 89
            System.out.println("Letter Grade  is B");
        } else if (score >= 70 && score <= 79) { // // This 'else if' checks - if the score is between 70 and 79.
            System.out.println("Letter Grade  is C");
        } else if (score >= 60 && score <= 69) { // // This 'else if' checks - if the score is between 60 and 69.
            System.out.println("Letter Grade  is D");
        } else if (score >= 0 && score <= 59) {  // This 'else if' checks - if the score is between 0 and 59.
            System.out.println("Letter Grade  is F");
        } else {
            System.out.println("This is incorrect degree ..");
        }
/*  Q 5Write a Java program that takes a person's age as input and categorizes them into one of three age categories: "Child,"
    "Teenager," or "Adult" using an if statement. */
        System.out.println("*************************");
        System.out.println("Welcome to Person Age Checker Program ");
        System.out.print("Enter your age :");
        int yourAge = input.nextInt();
        if (yourAge < 13) { // If age is less than 13 is Child
            System.out.print("You is Child");
        } else if (yourAge >= 13 && yourAge <= 19) { // If age is between 13 and 19  is Teenager
            System.out.print("You is Teenager");
        } else if (yourAge >= 20) { // If age is 20 or older is  Adult
            System.out.print("You is Adult");
        } else { // // This line if age is invalid( like -5)
            System.out.print("Invalid age");
        }

    }
}