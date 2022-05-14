import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //MINI Project
        int userNumber;
        Scanner sc = new Scanner(System.in);
        int myNumber =(int)(Math.random()*100);
        do {
            System.out.println("Guess the random number (1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Congratulation! You are Genius");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is greater");

            } else {
                System.out.println("Your number is small");
            }
        }
        while(userNumber >= 0);
        System.out.println("The random Number is: " + myNumber);
    }
}