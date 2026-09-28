// super keyword in java.

class base
{
   public void show()
   {
     System.out.println("Base is Call");
   }
}

class child extends base
{
 public void show()
   {
    super.show();
    System.out.println("child is call");
   
  }

public static void main(String arg[])
{
  child c=new child();
   c.show();
}

}
 

