package Test;
import java.net.*;
import java.io.*;
import java.util.*;
public class Server 
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the PortNumber: ");
		    int port=sc.nextInt();
		    ServerSocket ss = new ServerSocket(port);
		    Socket s = ss.accept();
		    InputStream is1=s.getInputStream();
		    OutputStream os1=s.getOutputStream();
		    byte [] b1=new byte[100];
		    byte [] b2=new byte[100];
		 while(true)
		  {
			 is1.read(b1);
			 String st=new String(b1);
			 String st2=st.trim();
			 System.out.println("From Client:"+st2);
			 System.out.print("To Client : ");
             System.in.read(b2);
			 os1.write(b2);
		  }//End of loop
		}//End of try block
		catch(Exception e)
		{
			System.err.println(e);
		}//End of Catch block
		
	}

}
