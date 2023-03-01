import java.util.*;
public class PrimeFunction{
    public static void primeFunc(int n){    
        int i,m=0,flag=0;
       //it is the number to be checked    
        m=n/2;      
        if(n<=1){  
         System.out.println(n+" is not prime number");      
        }else{  
         for(i=2;i<=m;i++){      
          if(n%i==0){      
           System.out.println(n+" is not prime number");      
           flag=1;      
           break;      
          }      
         }      
         if(flag==0)  { System.out.println(n+" is prime number"); }  
        }//end of else  
      } 
      public static void main(String args[])
      {
        Scanner sc =new Scanner(System.in);      
        int n = sc.nextInt(); 
        primeFunc(n);
      }   
}
