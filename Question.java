import java.util.*;
public class Question {
    public static void main(String args[])
    {
        int x;
        int rows;
        int columns;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        rows = sc.nextInt();
        System.out.print("Enter columns : ");
        columns = sc.nextInt();
        System.out.print("Enter value of x : ");
        x = sc.nextInt();
        int numbers[][] = new int[rows][columns];

        for(int i=0; i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print("Enter value of Array : ");
                numbers[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(numbers[i][j]==x)
                {
                    System.out.println("x found at Index : " +"rows :"+ i + " " +", column : "+ j );
                     break;
                }
              
            }
        }
    }
}
