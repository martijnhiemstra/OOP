import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programmeren is leuk!!");
		
		int a = 1099;
		String t = "Test";
		
		// Maak product 1 aan
		Product product1 = new Product();
		product1.electric = true;
		
		// Maak product 2 aan
		Product product2 = new Product();

		// Method call
		product1.printName();
		
		product1.overridePrice(1234, "Test");
		
		double totalPrice = product1.calculateTotalPrice();
		System.out.println("Total price = " + totalPrice);
		
		Product product3 = new Product("Laptop", 12, true, 21); 
		
		
		// Animal is abstract dus deze kunnen we niet aanmaken
//		Animal animal1 = new Animal();
//		animal1.setName("Diertje");
		
		Dog dog1 = new Dog();
		dog1.setName("Woefie");
		dog1.makeSound();
		
		Cat cat1 = new Cat();
		cat1.setName("Poes");
		cat1.setLegs(4);
		cat1.setSleepsHours(12);
		cat1.makeSound();
		
		Tiger tiger1 = new Tiger();
		
		List<Animal> animals = new ArrayList<>();
		animals.add(cat1);
		animals.add(dog1);
		animals.add(tiger1);
		
		animals.forEach(animal -> {
			animal.makeSound();
		});
	}

}
