import java.util.*;
public class Question1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int number[] = new int[size];


     
        System.out.print("Enter value of x : ");
        int x = sc.nextInt();

        // input
        for(int i =0; i<size;i++)
        {
            number[i] = sc.nextInt();
        }
        // Output
        for(int i =0;i<number.length;i++)
        {
            if(number[i]==x)
            {
                System.out.print("x found at : ");
                System.out.println(i);
                break;
            }
        }

    }
}