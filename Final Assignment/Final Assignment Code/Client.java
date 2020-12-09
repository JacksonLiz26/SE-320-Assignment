import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import javax.swing.*;
import java.util.Scanner;

public class Client {
	
	double infoW;
	double infoH;
	private static DataOutputStream outputToServer;
	private static DataInputStream inputFromServer;
	
	public static void main(String[] args) {
		
	      try {
	    	  Socket socket = new Socket("localhost", 6666);
				
				inputFromServer = new DataInputStream( //data in serial form from socket
						socket.getInputStream());
				outputToServer = new DataOutputStream(
						socket.getOutputStream());
	    	  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	  		
	  	    System.out.println("Enter height in meters: " );
	  	    double infoH = myObj.nextDouble();
	  	    System.out.println("Enter Weight in kilograms: ");
	  	    double infoW = myObj.nextDouble();
	  	  
	  	 // Send the weight to the server
	  	    System.out.println(infoW);
	  	    
	  	      outputToServer.writeDouble(infoW);

	  	 // Send the height to the server
			outputToServer.writeDouble(infoH);
			double bmi = inputFromServer.readDouble();
			
						
			System.out.println("Your BMI is: " + bmi);
			
			outputToServer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
