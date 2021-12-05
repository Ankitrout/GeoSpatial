import java.util.*;

public class Geospatial {
    static double findDistance(double x, double y, double a, double b) {
        double L1 = x / 57.29577951; // converting the given values to radians
        double Y1 = y / 57.29577951;
        double L2 = a / 57.29577951;
        double Y2 = b / 57.29577951;
        System.out.println("The given latitude and longitude are: " + L1 + " " + Y1);
        System.out.println("The given latitude and longitude are: " + L2 + " " + Y2);
        double Latitude = L2 - L1;
        double Longitude = Y2 - Y1;
        double D = Math.pow(Math.sin(Latitude / 2), 2)
                + Math.cos(L1) * Math.cos(L2) * Math.pow(Math.sin(Longitude / 2), 2);
        double c = 2 * Math.asin(Math.sqrt(D));
        double r = 6371;
        return (c * r);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating a Scanner object sc
        System.out.println("Enter the co-ordinates of the First location: ");
        System.out.println("Enter the Latitude: ");
        double x;
        Scanner scanned_value = new Scanner(System.in);
		/* creating scanner object to store user input(latitude) of first location */
        x = scanned_value.nextDouble();
        System.out.println("Enter the Longitude: ");
        double y;
        Scanner scanned_value2 = new Scanner(System.in); 
		/* creating scanner object to store user input(longitude) of first location*/
        y = scanned_value.nextDouble();
        System.out.println("Enter the co-ordinates of the Second location: ");
		System.out.println("Enter the Latitude: ");
        double a;
        Scanner scanned_value3 = new Scanner(System.in);
		/* creating scanner object to store user input(latitude) of first location */
        a = scanned_value.nextDouble();
		 System.out.println("Enter the Longitude: ");
        double b;
        Scanner scanned_value4 = new Scanner(System.in);
		/* creating scanner object to store user input(longitude) of first location*/
        b = scanned_value.nextDouble();
        System.out.println(findDistance(x, y, a, b) + " "+"K.M");
        sc.close();
    } 

}

