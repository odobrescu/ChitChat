import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket
{
	Socket socket;
	private String ip = "10.45.52.108";
	ObjectInputStream inputStream;
	ObjectOutputStream outputStream ;
	
	
	public ClientSocket()
	{
		
		Scanner sin = new Scanner(System.in);
		try
		{
			socket = new Socket(ip, 8000);
			
			outputStream = new ObjectOutputStream(socket.getOutputStream());
			inputStream = new ObjectInputStream(socket.getInputStream());
			System.out.println(" --------------------------------");
			Message x = new Message();
			while (true)
			{				
				x.setMessage(sin.nextLine());
				outputStream.writeUnshared(x);
				outputStream.flush();
				outputStream.reset();
				
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		sin.close();
	}
}
