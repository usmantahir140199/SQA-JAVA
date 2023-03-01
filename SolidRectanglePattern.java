  //outer loop
       //outer for(int i=1;i<=4;i++){
            //inner loop
          // inner for(int j=1;j<=5;j++){
            //    System.out.print("*");
           // }
          //  System.out.println("");
       // }

       public class SolidRectanglePattern{
        public static void main(String args[]){
            int n=4;
            int m=5;
            // Outer Loop
for (int i = 1; i<=n;i++)
{
    for(int j=1;j<=m;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
        }
       }