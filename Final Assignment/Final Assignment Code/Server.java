import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import javax.swing.*;
import java.util.Scanner;

public class Server {
	

	boolean dummyBool;
	public double bmi;
	
	public static void main(String[] args) 
	{
			
		try {
			ServerSocket serverSocket = new ServerSocket(6666);		
			Socket socket = serverSocket.accept();
			
			//creating data input and output streams
			DataInputStream inputFromClient = new DataInputStream(
					socket.getInputStream());
			DataOutputStream outputToClient = new DataOutputStream(
					socket.getOutputStream());
			
			
				//TODO implemented by the user
				//Receive data from client and split
				double weight = inputFromClient.readDouble();
		        double height = inputFromClient.readDouble();

		        // Compute BMI
		        double bmi = weight/(height*height);
		        

		        // Send results back to the client
		        outputToClient.writeDouble(bmi);

			inputFromClient.close();
			outputToClient.close();
			serverSocket.close();
			socket.close();
		}
		catch(IOException ex)
		{
			System.err.println(ex);
		}
	} 
	
}