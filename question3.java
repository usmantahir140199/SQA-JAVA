import java.util.Scanner;

public class question3 {
    public static int greaterNumber(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
 int c = greaterNumber(a, b);
 System.out.println(c);
    }
}
