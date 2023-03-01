import java.util.Scanner;

public class question7 {
 public static void main(String args[])
 {
    int choice;
    int number;
    int post=0;
    int neg=0;
    int zero=0;
    Scanner sc = new Scanner(System.in);
    do{
System.out.print("Enter Number : ");
 number = sc.nextInt();
     
        if(number>0)
        {
            post ++;
        }
        else if(number<0)
        {
            neg ++;
        }
        else{
            zero++;
        }
System.out.println("Do you want to continue : (1)Yes (0)No");
choice = sc.nextInt();
    }while(choice == 1);
   
    System.out.println("Positive number is : "+ post);
    System.out.println("Negative number is : "+ neg);
    System.out.println("Zero number is : "+ zero);
}
}
