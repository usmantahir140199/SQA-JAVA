import java.util.*;

public class Calculator2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      //  System.out.print("Enter Operator:");
        //char c = sc.next();
        char c='*';
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        switch(c){
            case '*':
            int mul = a*b;
            System.out.println(mul);
            break;
            case '+':
            int add = a+b;
            System.out.println(add);
            break;
            case '-':
            int sub = a-b;
            System.out.println(sub);
            break;
            case '/':
            int div = a/b;
            System.out.println(div);
            break;
            case '%':
            int mod = a%b;
            System.out.println(mod);
            break;
            default:
            System.out.println("Invalid Operation");

        }


    }
}