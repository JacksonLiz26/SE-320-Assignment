import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientManager extends Thread{
	
	final DataInputStream anger;
	final DataOutputStream angry;
	final Socket s;
	
	
	public ClientManager(Socket s, DataInputStream anger, DataOutputStream angry)
	{
		this.s = s;
		this.anger = anger;
		this.angry = angry;
	}
	
	public void run()
	{
		double weight;
		double height;
		double
		bmi = 0;
		
			try 
			{
			angry.writeUTF("Input your weight in kilos (not trying to be rude, sorry, its a business thing dude): ");
			weight = anger.readDouble();
			angry.writeUTF("Input your height in meters (please): ");
			height = anger.readDouble();
			bmi = getBMI(weight, height);
			angry.writeUTF("The BMI is: ");
			angry.writeDouble(bmi);			
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			
			try
			{
				//need to close everything out
				this.angry.close();
				this.anger.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
	
	public static double getBMI(double weight, double height)
	{
		return weight/(height*height);
	}

}
