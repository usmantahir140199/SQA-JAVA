import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        switch(c){
            case 1:
            int mul = a*b;
            System.out.println(mul);
            break;
            case 2:
            int add = a+b;
            System.out.println(add);
            break;
            case 3:
            int sub = a-b;
            System.out.println(sub);
            break;
            case 4:
            int div = a/b;
            System.out.println(div);
            break;
            case 5:
            int mod = a%b;
            System.out.println(mod);
            break;
            default:
            System.out.println("Invalid Operation");

        }


    }
}
