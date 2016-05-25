import java.io.Serializable;

public class Message implements Serializable
{
	private String clientName;
	private boolean privateMessage;
	private boolean disconnect;
	private String destination;
	private String message;

	

	/**
	 * getters and setters
	 */
	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public String getClientName()
	{
		return clientName;
	}

	public void setClientName(String clientName)
	{
		this.clientName = clientName;
	}

	public boolean isPrivateMessage()
	{
		return privateMessage;
	}

	public void setPrivateMessage(boolean privateMessage)
	{
		this.privateMessage = privateMessage;
	}

	public boolean isDisconnect()
	{
		return disconnect;
	}

	public void setDisconnect(boolean disconnect)
	{
		this.disconnect = disconnect;
	}

	public String getDestination()
	{
		return destination;
	}

	public void setDestination(String destination)
	{
		this.destination = destination;
	}

}
