package CyberCity;

import java.util.Scanner;

public class CitizenRegistration {

    void main() {

        System.out.println("Welcome to Cyber City\n");
        Scanner userInput = new Scanner(System.in);
        int numberOfCitizens = (0);

        while (true) {
            System.out.println("Please enter your name: ");
            String citizenName = userInput.nextLine();

            if (citizenName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Please enter your job title: ");
            String jobTitle = userInput.nextLine();

            System.out.println("Please enter your monthly credits: ");
            double monthlyCredits = userInput.nextDouble();
            userInput.nextLine();

            if (jobTitle.equals("Hacker") || jobTitle.equals("Android")) {
                System.out.println("Welcome to the underground " + citizenName);
            }
            else if (monthlyCredits > 10_000 && !jobTitle.equals("Politician")) {
                System.out.println("Welcome, High-Value Citizen");
            }
            else {
                System.out.println("Welcome to the Slums");
            }

            double totalTax = monthlyCredits * 0.12D;
            System.out.println("Your Contribution to the City:" + totalTax + " credits.");

            String isThreat = (jobTitle.equals("Hacker")) ? "Red" : "Green";
            System.out.println("Security Clearance: " + isThreat);

            numberOfCitizens++;
        }
        System.out.println(" ");
        System.out.println(numberOfCitizens + " citizens registered");
    }
}