import java.net.*;

import java.rmi.*;


public class Server
{

 public static void main(String args[])
 {

  try
  {

   SynServer Obj=new SynServer();

   Naming.rebind("Social",Obj);

  }

  catch(Exception e)
  {

   System.out.println("Exception: "+e);

  }

 }

}
