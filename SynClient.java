import java.rmi.*;

import java.util.*;


public class SynClient
{

 static String name;

 public static void main(String args[])
 {

  try
  {

   Scanner input=new Scanner(System.in);

   String URL="rmi://localhost/Social";

   int i=1;

   int p=0;

   System.out.print("Enter Your username:- ");

   name=input.next();
			
   String send="None";
			
   String reply;
			
   System.out.println("Welcome user "+name);
			 
   System.out.println("If you want to stop type 'Bye'");
			
   while(!send.equals("bye"))
   {

    System.out.print(name+": ");

    send=input.nextLine();
				
    Inter intf=(Inter)Naming.lookup(URL);
				
    reply=intf.Convo(send);
				 
    System.out.println("Server: "+reply);
			
   }

  }

  catch(Exception e)
  {

   System.out.println("Exception: "+e);
		
  }

 } 

}
