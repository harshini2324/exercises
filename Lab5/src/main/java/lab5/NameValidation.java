package lab5;
public class NameValidation 
{
	String first_name;
	String last_name;
	public NameValidation(String a, String b) {
		super();
		this.first_name = a;
		this.last_name = b;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	@Override
	public String toString() {
		return "NameValidation [first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	
}
