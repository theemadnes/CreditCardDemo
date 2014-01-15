
public class CreditCardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard cc = new CreditCard();
		cc.getBalance();
		cc.getLimit();
		cc.getPersonals();
		
		// adding values
		
		Money addVal = new Money(10.50);
		cc.charge(addVal);
		cc.getBalance();
		Money subVal = new Money(5.00);
		cc.payment(subVal);
		cc.getBalance();
		

	}

}
