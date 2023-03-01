import java.util.Scanner;

public class EvenNumber {
    public static String evenNumber(int n)
    {
if(n%2==0)
{
    return "Even";
}
else{
    return "Odd";
}
    }
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String c= evenNumber(n);
System.out.println(c);
    }
}
