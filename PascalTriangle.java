public class PascalTriangle {
   public static void main(String[] args)
   {
      int n=5, i, j,num;
      for(i=0; i<n; i++)
      {
         for(j=1; j<=n-i; j++)
         {
            System.out.print(" ");
         }
     num=1;
         for(j=0; j<=i; j++)
         {
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
         }
         System.out.println();
      }
}
}
