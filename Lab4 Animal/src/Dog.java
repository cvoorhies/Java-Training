
public class Dog implements Animal {

	int height;
	int weight;
	
	public Dog()
	{
		weight = (int) (Math.random() * 10);
		height = (int) (Math.random() * 10);
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void eat() {
		System.out.println("Eating like a Dog!");
		
	}

	public void sleep() {
		System.out.println("Sleeping like a Dog!");

	}
	

}
