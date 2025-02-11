# Exercise (Conditional) 
This repository has Exercises ( Java Basics ) questions with code solutions .

---
## Question 1
Write a program that checks the role of the user.

```java
        System.out.println("Welcome to role of the user Checker program ");
        System.out.print("Please enter your role :");
        String role = input.nextLine();
        if(role.equalsIgnoreCase("admin")){
            System.out.println("Welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome superuser");
        }else  if (role.equalsIgnoreCase("user")){
            System.out.println("Welcome user");
        }else {
            System.out.println("Please enter admin, superuser or user ");
        }
```

## Question 2
Take three numbers from the user and print the greatest number. 

```java
        System.out.println("Welcome to greatest number program ");
        System.out.print("Please enter 1st number :");
        int num_1st = input.nextInt();
        System.out.print("Please enter 2nd number :");
        int num_2nd = input.nextInt();
        System.out.print("Please enter 3rd number:");
        int num_3rd = input.nextInt();
        if(num_1st >= num_2nd && num_1st >= num_3rd){
         System.out.println(num_1st +" is the largest number.");
        } else if (num_2nd >= num_1st && num_2nd >= num_3rd) {
           System.out.println(num_2nd +" is the largest number.");
        }else { 
           System.out.println(num_3rd +" is the largest number.");
        }
```
## Question 3
Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday. 

```java
        System.out.println("Welcome to greatest number program ");
        System.out.print("Please enter 1st number :");
        int num_1st = input.nextInt();
        System.out.print("Please enter 2nd number :");
        int num_2nd = input.nextInt();
        System.out.print("Please enter 3rd number:");
        int num_3rd = input.nextInt();
        if(num_1st >= num_2nd && num_1st >= num_3rd){
        System.out.println(num_1st +" is the largest number.");
        } else if (num_2nd >= num_1st && num_2nd >= num_3rd) {
        System.out.println(num_2nd +" is the largest number.");
        }else  {
        System.out.println(num_3rd +" is the largest number.");
       }
```

## Question 4
Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:
<p>A: 90 - 100</p>
<p>B: 80 - 89</p>
<p>C: 70 - 79</p>
<p>D: 60 - 69</p>
<p>F: 0 - 59</p>

```java
  
```

## Question 5
Write a Java program that takes a person's age as input and categorizes them into one of three age categories: "Child," "Teenager," or "Adult" using an if statement. 
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
• If the age is 20 or older, categorize them as an "Adult."
```java
  
```

