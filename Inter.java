import java.rmi.*;


public interface Inter extends Remote
{

 String Convo(String S) throws RemoteException;

}
