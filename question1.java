import java.util.Scanner;

public class question1{
    public static int Average(int a,int b,int c)
    {
      return (a+b+c)/3;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

int d= Average(a,b,c);
System.out.println(d);
    }
}