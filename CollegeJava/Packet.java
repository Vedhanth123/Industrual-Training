// creation of package
package Mypack;
public class Packet
{
  public void display()
  {
    System.out.println("Function from packet");
  }
  
  public static void main(String args[])
  {
    System.out.println("Calling from package");
  }
}

// using of package
import Mypack.Packet
public class One
{
  public static void main(String args[])
  {
    Packet obj = new Packet();
    obj.display();
  }
}
