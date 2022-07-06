package graphics;
import java.util.Scanner;
interface areas
{
 void area();
}
public class rectangle implements areas
{
  int l,b;
  public void area()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Input length");
    l=sc.nextInt();
    System.out.println("Input breadth");
    b=sc.nextInt();
    System.out.println("Area of rectangle: "+l*b);
    sc.close();
   }
}
  
