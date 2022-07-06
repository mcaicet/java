package graphics;
import java.util.Scanner;
interface areas
{
 void area();
}
public class square implements areas
{
  int s;
  public void area()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Input side");
    s=sc.nextInt();
    String area=Double.toString(s*s);
    System.out.println("Area of square: "+area);
   }
}
