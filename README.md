# Exercise (Conditional) 
This repository has Exercises ( Java Basics ) questions with code solutions .

---
## Question 1
Write a program that checks the role of the user.

```java
        System.out.println("Welcome to  User Role Checker program ");
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
        System.out.println("Welcome to  Weekday Name Display Program");
        Random rand = new Random(); 
        int randomNum = rand.nextInt(7) + 1; 
        System.out.println(" The number :" + randomNum);
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
        System.out.println("Welcome to  Grade Display Program");
        System.out.print("Enter your numeric score :");
        int score = input.nextInt();
        System.out.println("Enter Numeric Score :" + score);
        if (score >= 90 && score <= 100) {  
            System.out.println("Letter Grade is A");
        } else if (score >= 80 && score <= 89) { 
            System.out.println("Letter Grade  is B");
        } else if (score >= 70 && score <= 79) { 
            System.out.println("Letter Grade  is C");
        } else if (score >= 60 && score <= 69) { 
            System.out.println("Letter Grade  is D");
        } else if (score >= 0 && score <= 59) {  
            System.out.println("Letter Grade  is F");
        } else {
            System.out.println("This is incorrect degree ..");
        }
```

## Question 5
Write a Java program that takes a person's age as input and categorizes them into one of three age categories: "Child," "Teenager," or "Adult" using an if statement. 
<p>use an if statement to categorize the age based on the following criteria:</p>
<p>• If the age is less than 13, categorize them as a "Child."</p>
<p>• If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."</p>
<p>• If the age is 20 or older, categorize them as an "Adult."</p>

```java
        System.out.println("Welcome to Person Age Checker Program ");
        System.out.print("Enter your age :");
        int yourAge = input.nextInt();
        if (yourAge < 13) { 
            System.out.print("You is Child");
        } else if (yourAge >= 13 && yourAge <= 19) { 
            System.out.print("You is Teenager");
        } else if (yourAge >= 20) {
            System.out.print("You is Adult");
        } else { 
            System.out.print("Invalid age");
        }

```

