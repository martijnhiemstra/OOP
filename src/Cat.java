
public class Cat extends Animal {

	protected int sleepsHours;

	public int getSleepsHours() {
		return sleepsHours;
	}

	public void setSleepsHours(int sleepsHours) {
		this.sleepsHours = sleepsHours;
	}
	
	public void makeSound() {
		System.out.println("Miauw");
	}
	
}
