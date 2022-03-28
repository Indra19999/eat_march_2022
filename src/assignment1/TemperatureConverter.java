package assignment1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        System.out.println("----------------------------------Welcome----------------------------------------------");
        System.out.println("-----------------Celsius-Fahrenheit/Fahrenheit-Celsius converter-----------------------");

        int n;
        do {
            System.out.println("Choose the Conversion Mode: ");
            Scanner userInput = new Scanner(System.in);
            System.out.println("1- Celsius-Fahrenheit");
            System.out.println("2- Fahrenheit-Celsius");
            n = userInput.nextInt();

            while(n != 1 && n!=2){
                System.out.println("Wrong Entry. Please choose 1 or 2");
                n = userInput.nextInt();
                if(n == 1|| n == 2){
                    break;
                }
            }

            if (n == 1) {
                System.out.println("Enter the temperature in Celsius");
                int temp = userInput.nextInt();
                int cvt = (temp * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit is: " + cvt);

            }
            if (n == 2) {
                System.out.println("Enter the temperature in Fahrenheit");
                int temp = userInput.nextInt();
                int cvt = (temp - 32) * 5 / 9;
                System.out.println("Temperature in Celsius is: " + cvt);

            }
            System.out.println("Do you want to do other conversion? 1- Yes, 2- No");
            n= userInput.nextInt();

            while(n != 1 && n!=2) {
                System.out.println("Wrong Entry. Please choose 1 or 2");
                n = userInput.nextInt();
                if (n == 1 || n == 2) {
                    break;
                }
            }


        } while (n == 1);
        System.out.println("GoodBye. See you soon.");



    }
}
