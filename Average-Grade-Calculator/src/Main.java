//------------------------------------------------------------------------------------------------------------------- Grades ------------------------------------------------------------------------------------------------------------------- //

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create & Assign values to Array.
        int[] myTestResults = new int[5];

        //Variables
        int testCounter = 0;
        int total = 0;
        int average = 0;
        char grade = 0;

        // This code block is responsible for taking input from the user for each test grade.
        for (int i = 0; i < myTestResults.length; i++) {
            testCounter += 1;
            System.out.println("Please Enter Your Grade For Test " + testCounter + " : ");
            myTestResults[i] = sc.nextInt();
        }
        //Calculating the total sum of all the test grades stored in the `myTestResults` array.
        for (int i = 0; i < myTestResults.length; i++) {
            total += myTestResults[i];
        }

        //Calculate average
        average = total / testCounter;

        //Assign Letter Symbol
        if (average > 80) {
            grade = 'A';
        } else if (average >= 70 && average <= 79) {
            grade = 'B';
        } else if (average >= 60 && average <= 69) {
            grade = 'C';
        } else if (average >= 50 && average <= 59) {
            grade = 'D';
        } else if (average < 49)
            grade = 'F';

        System.out.println("Total : " + total);
        System.out.println("Average = (" +
                myTestResults[0] + " + " +
                myTestResults[1] + " + " +
                myTestResults[2] + " + " +
                myTestResults[3] + " + " +
                myTestResults[4] + ") " + "/ " +
                testCounter + " = " +
                average);
        System.out.println("Final Class Grade : " + grade);

    }
}