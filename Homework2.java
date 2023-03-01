import java.util.Scanner;

//For a given matrix of N x M, print its transpose.

public class Homework2 {
    public static void main(String args[])
    {
        int rows;
        int columns;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        rows = sc.nextInt();
        System.out.print("Enter columns : ");
        columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
            System.out.print("Enter Array Value : ");
            numbers[i][j] = sc.nextInt();    
            }
        }
    for(int j = 0; j<columns;j++)
    {
        for(int i=0;i<rows;i++)
        {
            System.out.print(numbers[i][j] + " ");
        }
        System.out.println();
    }

    }
}
