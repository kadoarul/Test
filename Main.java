import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        int mpgRat;
        double tankC;
        double perT;
        int rawRange;

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        mpgRat = scnr.nextInt();

        if (mpgRat <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }

        else{
            System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        }
        tankC = scnr.nextDouble();

        if (tankC <= 0) {
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }
        else {
            System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        }

        perT = scnr.nextDouble();

        if (perT > 100 || perT < 0) {
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            return;
        }
        else {
            rawRange = (int) (mpgRat * tankC * (perT * .01));
            if (rawRange <= 25) {
                System.out.print("Attention! Your current estimated range is running low: " + rawRange + " miles left!!!");
            }
            if (rawRange > 25) {
                System.out.print("Keep driving! Your current estimated range is: " + rawRange + " miles!");
            }


        }


    }
}
