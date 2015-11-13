import java.util.Scanner;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		Scanner keyboard = new Scanner(System.in);

		
		System.out.println("Enter a name.");
		String name = keyboard.next();
		person.setName(name);
		System.out.println(person.getName());
		System.out.println("Enter an age.");
		int age = keyboard.nextInt();
		person.setAge(age);
		System.out.println(person.getAge());
		
		System.out.println(person);
		
		
		Person person2 = new Person();
		
		

		
		System.out.println("Enter a name.");
		name = keyboard.next();
		person2.setName(name);
		System.out.println(person.getName());
		System.out.println("Enter an age.");
		age = keyboard.nextInt();
		person2.setAge(age);
		System.out.println(person.getAge());
		
		System.out.println(person2);
		
		if ((person.getName().equals(person2.getName())&&(person.getAge() == (person2.getAge())))) {
			System.out.println("\nPerson objects are the same.");
		}
		else {
			System.out.println("\nPerson objects are not equal.");
		}
	
		if (person.getName().equals(person2.getName())) {
			System.out.println("Person objects have the same name.");
			
		}
		else {
			System.out.println("Person objects do not have the same name.");
		}
		if (person.getAge()==(person2.getAge())) {
			System.out.println("Person objects have the same age.");
		}
		else {
			System.out.println("Person objects do not have the same age.");
		}
		
	if (!(person.getAge() == person2.getAge())) {
		
		if (person.getAge() > person2.getAge()) {
			System.out.println(person.getName() + " is older than " + person2.getName() + ".");
		}
		else {
			System.out.println(person.getName() + " is younger than " + person2.getName() + ".");
		}
	}
	
	}
}




