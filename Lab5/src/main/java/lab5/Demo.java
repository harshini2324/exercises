package lab5;

public class Demo {

	public static void main(String[] args) 
	{
		NameValidation nv = new NameValidation("","");
		try
		{
			int a = nv.getFirst_name().length();
			int b = nv.getLast_name().length();
			if(a<1|b<1)
			{
				throw new NameException("blank");
			}
		}
		catch(NameException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}

