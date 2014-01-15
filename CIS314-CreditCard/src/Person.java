
public class Person {
	private String lastName = "";
	private String firstName = "";
	private Address home = new Address();
	
	public Person(String last, String first)
	{
		this.lastName = last;
		this.firstName = first;
	}
	
	public String toString()
	{
		return (lastName + " " + firstName + " " + home.toString());
	}
}
