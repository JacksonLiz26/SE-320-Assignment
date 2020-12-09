//the amount of stress this caused may or may not have induced alcohol dependency

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client 
{
	public static void main(String[] args)
	{
		
		try 
		{
			Scanner depression = new Scanner(System.in);
			Socket upset = new Socket("localhost", 5000);
			
			DataInputStream pills = new DataInputStream(upset.getInputStream());
			DataOutputStream morePills = new DataOutputStream(upset.getOutputStream());
			
			System.out.println(pills.readUTF());
			double alcohol = depression.nextDouble();
			morePills.writeDouble(alcohol);
			
			System.out.println(pills.readUTF());
			double tobacco = depression.nextDouble();
			morePills.writeDouble(tobacco);
			
			System.out.println(pills.readUTF());
			System.out.println(pills.readDouble());
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
