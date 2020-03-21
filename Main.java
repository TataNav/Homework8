/*
 * Create a class Person, which has fields name and balance 
 * (amount of money that this person has).
 */
public class Main {
	public static void main(String[] args) {
		int countPerson = 0;
		/*
		 * Create 2 companies named - A and B. 
		*/
		Company first = new Company();
		first.name = "A";
		
		Company second = new Company();
		second.name = "B";
		
		/*
		 * Create 6 persons with various amounts of balance. 
		 * Assign 3 of them to company A and 3 of them to company B. 
		 */
		Person person1 = new Person();
		person1.name = "Adam";
		person1.company = first;
		person1.balance = 18.5;
		countPerson++;
		
		Person person2 = new Person();
		person2.name = "Tom";
		person2.company = second;
		person2.balance = 50;
		countPerson++;
		
		Person person3 = new Person();
		person3.name = "Sarah";
		person3.company = first;
		person3.balance = 55.08;
		countPerson++;
		
		Person person4 = new Person();
		person4.name = "Kate";
		person4.company = second;
		person4.balance = 11;
		countPerson++;
		
		Person person5 = new Person();
		person5.name = "James";
		person5.company = first;
		person5.balance = 9;
		countPerson++;
		
		Person person6 = new Person();
		person6.name = "Suzan";
		person6.company = second;
		person6.balance = 100.25;
		countPerson++;
		
		//Call this method several times on several persons
		person5.sendMoney(person6, 50);
		System.out.println(person6.balance);
		System.out.println(person5.balance);
		System.out.println();
		
		person4.sendMoney(person5, 10);
		System.out.println(person5.balance);
		System.out.println(person4.balance);
		System.out.println();
		
		person3.sendMoney(person1, 10);
		System.out.println(person3.balance);
		System.out.println(person1.balance);
		System.out.println();
		
		person2.sendMoney(person2, 10);
		System.out.println(person2.balance);
		System.out.println(person2.balance);
		System.out.println();
		
		
		//Add persons to an array. Add companies to an array.
		Person listOfPerson[] = new Person[countPerson];
		listOfPerson[0] = person1;
		listOfPerson[1] = person2;
		listOfPerson[2] = person3;
		listOfPerson[3] = person4;
		listOfPerson[4] = person5;
		listOfPerson[5] = person6;
		
		Company listOfCompany[] = new Company[2];
		listOfCompany[0] = first;
		listOfCompany[1] = second;
		
		//Find a person with most balance.
		double balance = listOfPerson[0].balance;
		String name = " ";
		for (int j = 0; j < listOfPerson.length; j++) {
			if (balance < listOfPerson[j].balance) {
				balance = listOfPerson[j].balance;
				name = listOfPerson[j].name;
			}
		}
		System.out.println(name);
		
		//Find company which has highest value if you sum balances of all its persons.
		double sumA_Balance = 0;
		double sumB_Balance = 0;
		
		for (int i = 0; i < listOfPerson.length; i++) {
			if (listOfPerson[i].company == first) {
				sumA_Balance = sumA_Balance + listOfPerson[i].balance;
			}
			if (listOfPerson[i].company == second) {
				sumB_Balance = sumB_Balance + listOfPerson[i].balance;
			}
		}
		
		if (sumA_Balance > sumB_Balance) {
			System.out.println(sumA_Balance);
		} else {
			System.out.println(sumB_Balance);
		}
		
	}
	

	/*
	 * Add method named sendMoney to Person class. 
	 * This method takes 2 arguments - otherPerson and amount. 
	 * When called, this method must pass amount of money specified by amount argument 
	 * to a person specified by otherPerson argument. 
	 * For example, calling a.sendAmount(b, 35.6) must pass 35.6 money to from person a to person b.
	 */
	
//	public static void sendMoney(Person fromPerson, Person toPerson, double amount){
//		
//		if(fromPerson != toPerson) {
//			fromPerson.balance = fromPerson.balance - amount;
//			toPerson.balance =  toPerson.balance + amount;
//		}		
//	}
}
