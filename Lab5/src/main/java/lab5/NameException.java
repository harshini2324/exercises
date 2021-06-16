package lab5;
@SuppressWarnings("serial")
public class NameException extends Exception 
{

	public NameException(String msg)
	{
		super(msg);
	}

	@Override
	public String toString() {
		return "NameExcetion : First name or Last name can't be Blank"+ super.getMessage();
	}
	
	
	
}

