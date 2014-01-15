
public class CreditCard {
	private Money balance = new Money(1.00);
	private Money creditLimit = new Money(100.00);
	private Person owner = new Person("Smith", "Joe");
	
	public void getBalance()
	{
		System.out.println("balance: " + balance.toString());
	}
	
	public void getLimit()
	{
		System.out.println("limit:" + creditLimit.toString());
	}
	
	public void getPersonals()
	{
		System.out.println(owner.toString());
	}
	
	public void charge(Money chargeVal)
	{
		balance.add(chargeVal);
	}
	
	public void payment(Money payVal)
	{
		balance.subtract(payVal);
	}
}
