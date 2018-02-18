import java.rmi.*;

import java.rmi.server.*;

import java.util.*;


public class SynServer extends UnicastRemoteObject implements Inter
{

 public SynServer()throws RemoteException{}

 public String Convo(String s)throws RemoteException
 {
  String reply="";

  if(s.equals("Bye"))
  {

   System.out.println("Client: Bye");

   return "Buhbyee!!";

  }

  Scanner input1=new Scanner(System.in);

  System.out.println("User: "+s);

  System.out.print("Server: ");

  reply=input1.nextLine();

  return reply;	
 }

 public static void main(String args[]){
}

}