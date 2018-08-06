public class largest 
{
public static void main(String args[])
{
int x,y,z;
System.out.println("enter the numbers");
System.in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
z = in.nextInt();
if ( x > y && x > z )
{
         System.out.println("first largest.");
         }
      else if ( y > x && y > z )
      {
         System.out.println("Second largest.");
}
else if ( z > x && z > y )
 {
 System.out.println("Third  largest.");
}
       else   
         System.out.println("Entered numbers are not distinct.");
}
   }
}
