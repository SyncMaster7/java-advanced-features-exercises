package exerciseOne;

import java.util.Scanner;

public class ExerciseOneMain {

    public static void main(String[] args) {

        System.out.println("Provide email address to validate: ");
        Scanner sc = new Scanner(System.in);
        String providedEmail = sc.nextLine();

        UserValidator userVal = new UserValidator();
        String results = userVal.validateEmails("kermo@icloud.com");
        System.out.println(results);
    }
}
