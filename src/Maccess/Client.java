package Maccess;
import java.net.*;
import java.io.*;
import java.util.*;
public class Client 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Address: ");
			String address=sc.nextLine();
			System.out.println("Enetr the portNumber: ");
		    int port=sc.nextInt();
            Socket s=new Socket(address,port);
            OutputStream os = s.getOutputStream();
            InputStream is = s.getInputStream();                 
            byte []b1=new byte[100];
            byte []b2=new byte[100];
         while(true)
          {
              System.out.print("To Server: ");
	          System.in.read(b1);
	          os.write(b1);
	          is.read(b2);
	          String s1=new String(b2);
              String s2=s1.trim();
	          System.out.println("From Server:"+s2);
           }//End Of loop
        
		}//End of try block
		catch(Exception e)
		{
			System.err.println(e);
		}//End Of catch block
	}

}
