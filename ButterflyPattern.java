public class ButterflyPattern{
    public static void main(String args[])
    {
        int n=4;
        // First Loop
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    for(int j=1;j<=(n-i)*2;j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
 
    
    System.out.println();
}
// 2nd Outer Loop
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
    System.out.print("*");
}
for(int j=1;j<=(n-i)*2;j++)
{
    System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
    System.out.print("*");
}
System.out.println();
}
    }
}