import java.util.Scanner;
import java.util.*;

// Student Name : Valentine Sah
// Student number : 100757000
// Date : November 13, 2022
// File name : valentine.sah_java-lab1

public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        // store the users in an array
        String[] users = {"Valentine", "John Doe", "Tom"};

        // create double array with 3 rows and 2 columns
        double[][] arr2 = new double[3][2];

        // increment the f variable to keep track of the game
        int f = 0;

            // loop that goes through each element in the double array to store values for the games
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 2; column++) {

                    // if it is the 1st row then get the scores for the first user in the array
                    if (row == 0)
                    {
                        System.out.println("Please enter the score for " + users[row] + " in GAME #" + ++f + ": ");
                    }

                    // if it is the 2nd row then get the scores for the second user in the array
                    if (row == 1)
                    {

                        System.out.println("Please enter the score for " + users[row] + " in GAME #" + ++f + ": ");

                    }

                    // if it is the 3rd row then get the scores for the second user in the array
                    if (row == 2)
                    {
                        System.out.println("Please enter the score for " + users[row] + " in GAME #" + ++f + ": ");

                    }

                    // validation to ensure number is not out of range and/or invalid
                    int input = 0;
                    while(input < 1)
                    {
                        try
                        {
                            arr2[row][column] = sc.nextInt();
                            if (arr2[row][column] >= 0 && arr2[row][column] <= 300)
                            {
                                input++;
                            }
                            else
                            {
                                System.out.println("Invalid input. Value between 0 and 300 needed. Please try again.");
                                sc.next();
                            }
                        }
                        catch (InputMismatchException e)
                        {
                            System.out.println("Invalid input. Numeric value needed. Please try again.");
                            sc.next();
                        }
                    }

                }

        }

        int count = 0;

        // for loop to display the users scores in a neat manner
        for(int row = 0; row < arr2.length; row++) {
            for(int column = 0; column < arr2[row].length; column++)
                {

                    // check if the user is called xyz and print his score details

                    if (users[row].equals("Valentine"))
                    {
                        float sum = 0;

                        if (column == 0)
                        {
                            System.out.println("\nScore Details for " + users[row] + ": ");
                        }

                        System.out.println("Game #" + ++count + ": " + arr2[row][column]);

                        if (column == 1){
                            for (int col = 0; col < 2; col++){
                                sum += arr2[row][col];
                            }

                            System.out.println("Average for " + users[row] + ": " + (sum/arr2[row].length));
                        }

                    }

                    if (users[row].equals("John Doe"))
                    {
                        float sum = 0;

                        if (row == 1 && column == 0)
                        {
                            System.out.println("\nScore Details for " + users[row] + ": ");
                        }

                        System.out.println("Game #" + ++count + ": " + arr2[row][column]);

                        if (row == 1 && column == 1){
                            for (int col = 0; col < 2; col++){
                                sum += arr2[row][col];
                            }

                            System.out.println("Average for " + users[row] + ": " + (sum/arr2[row].length));
                        }
                    }

                    if (users[row].equals("Tom"))
                    {
                        float sum = 0;

                        if (row == 2 && column == 0)
                        {
                            System.out.println("\nScore Details for " + users[row] + ": ");
                        }

                        System.out.println("Game #" + ++count + ": " + arr2[row][column]);

                        if (row == 2 && column == 1){
                            for (int col = 0; col < 2; col++){
                                sum += arr2[row][col];
                            }

                            System.out.println("Average for " + users[row] + ": " + (sum/arr2[row].length));
                        }
                    }

                }
        }
    }
}