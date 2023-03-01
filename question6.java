import java.util.Scanner;

public class question6 {
    public static void infinit(int i)
    {
        do{
System.out.println(i);
//break;
        }
        while(i==1);
    }
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
int i = 1;
infinit(i);
    }
}
