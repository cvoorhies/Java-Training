
public class Main {

	/**
	 * This program should create an array of type animal and by using polymorphism
	 * create different objects.
	 */
	public static void main(String[] args) {
		Animal[] a1;
		a1 = new Animal[5];
		
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Monkey m1 = new Monkey();
		
		for (int i=0; i<3; i++)
		{
			a1[0] = new Dog();
			a1[1] = new Cat();
			a1[2] = new Monkey();
						
			a1[i].eat();
			a1[i].sleep();
		}
		
		d1 = (Dog) a1[0];
		c1 = (Cat) a1[1];
		m1 = (Monkey) a1[2];
		
		int result;
		
		result = d1.getHeight();
		
		System.out.println("This is the Height of d1:");
		System.out.println(result);
		
		result = d1.getWeight();
		
		System.out.println("This is the Weight of d1:");
		System.out.println(result);
	}

}
