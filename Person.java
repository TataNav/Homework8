
public class Person {
	String name;
	double balance;
	Company company = new Company();
	
	public void sendMoney(Person toPerson, double amount){
		if (this != toPerson) {
			balance = balance - amount;
			toPerson.balance =  toPerson.balance + amount;	
		}	
	}
}
