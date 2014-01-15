
public class Money {
	private long dollars = 0;
	private long cents = 0;

	public Money(double value)
	{
		
		this.dollars = (long)value;
		String temp = Double.toString(value);
		String temp2[] = temp.split("\\.");		
		this.cents = Integer.parseInt(temp2[1]);
	}
	
	public Money(Money copyVal)
	{
		this.dollars = copyVal.dollars;
		this.cents = copyVal.cents;
	}
	
	public String toString()
	{
		return (Long.toString(dollars) + "." + Long.toString(cents));
	}
	
	public void add(Money addVal)
	{
		double tempVal1 = Double.parseDouble(Long.toString(dollars) + "." + Long.toString(cents));
		double tempVal2 = Double.parseDouble(Long.toString(addVal.dollars) + "." + Long.toString(addVal.cents));
		
		double tempVal3 = tempVal1 + tempVal2;
		
		this.dollars = (long)tempVal3;
		String temp = Double.toString(tempVal3);
		String temp2[] = temp.split("\\.");		
		this.cents = Integer.parseInt(temp2[1]);
		
	}
	
	public void subtract(Money addVal)
	{
		double tempVal1 = Double.parseDouble(Long.toString(dollars) + "." + Long.toString(cents));
		double tempVal2 = Double.parseDouble(Long.toString(addVal.dollars) + "." + Long.toString(addVal.cents));
		
		double tempVal3 = tempVal1 - tempVal2;
		
		this.dollars = (long)tempVal3;
		String temp = Double.toString(tempVal3);
		String temp2[] = temp.split("\\.");		
		this.cents = Integer.parseInt(temp2[1]);
		
	}
	
	public int compareTo(Money compVal)
	{
		double tempVal1 = Double.parseDouble(Long.toString(dollars) + "." + Long.toString(cents));
		double tempVal2 = Double.parseDouble(Long.toString(compVal.dollars) + "." + Long.toString(compVal.cents));
		
		if (tempVal1 > tempVal2) return 1;
		else return 0;
	}
	
	public boolean equals(Money compVal)
	{
		double tempVal1 = Double.parseDouble(Long.toString(dollars) + "." + Long.toString(cents));
		double tempVal2 = Double.parseDouble(Long.toString(compVal.dollars) + "." + Long.toString(compVal.cents));
		
		if (tempVal1 == tempVal2) return true;
		else return false;
	}
	
}
