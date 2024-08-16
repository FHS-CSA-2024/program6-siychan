//import stuff here!
import java.util.Scanner;
import java.lang.Math;//Your code here
public class Program6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();
        final double PI = 3.14159;
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + radius * 2);
        System.out.println("The Area of the circle = " + Math.round(radius * radius * PI * 1000) / 1000.0);
        System.out.println("The Circumfrence of the circle = " + Math.round(radius * 2 * PI * 1000) / 1000.0);
    }
}
//Paste console output below:
/*
Enter the radius:
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Circumfrence of the circle = 23.323
*/
