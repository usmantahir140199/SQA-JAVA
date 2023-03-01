import java.util.Scanner;

public class question5 {
    public static String vote(int age)
    {
if(age>18)
{
  //  System.out.println("This person is eligible to vote");
  return "This person is eligible to vote";
}
else{
    //System.out.println("This person is not eligible to vote");
    return "This person is not eligible to vote";
}
    }
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
int age= sc.nextInt();
String c= vote(age);
System.out.println(c);
    }

}
