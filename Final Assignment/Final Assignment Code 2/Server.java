import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
	public static void main(String[] args) throws IOException 
	{
		ServerSocket misery = new ServerSocket(5000);
		
		while (true)
		{
			Socket alsoMisery = null;
			
			try 
			{
				alsoMisery = misery.accept();
				DataInputStream hate = new DataInputStream(alsoMisery.getInputStream());
				DataOutputStream hatred = new DataOutputStream(alsoMisery.getOutputStream());
				
				Thread suffering = new ClientManager(alsoMisery,hate,hatred);
				suffering.start();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
