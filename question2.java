import java.util.Scanner;

public class question2 {
    public static void Sum(int n)
    {
        int odd=0;
        for(int i=1;i<=n;i++)
        {
if(i%2!=0)
{
 odd +=i;  

}
        }
        System.out.println(odd); 
    }
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Sum(n);
}    
}
