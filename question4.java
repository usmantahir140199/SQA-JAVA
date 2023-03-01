import java.util.Scanner;

public class question4 {
    public static void circumference(double radius)
    {
   final double Pi = 3.1415926536;// constant in java
 double circum =Pi * (radius*2);
System.out.println(circum);
    }
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
double radius = sc.nextFloat();
circumference(radius);
    }
}
