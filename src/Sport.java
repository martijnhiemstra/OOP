
public class Sport {
	
	public String name;
	
	public int maxPeople;
	
	// No arguments constructor
	public Sport() {
		System.out.println("In constructor");

		this.maxPeople = 20;
		this.name = "Sport";
	}
	
	// All args constructor
	public Sport(String name, int maxPeople) {
		this.name = name;
		this.maxPeople = maxPeople;
	}
	
	
	
	public void startSport() {
		System.out.println("Sport " + name + " is gestart");
	}
	
	public boolean startSport1(int maxPeople, String name) {
		System.out.println("Max people = " + maxPeople);
		System.out.println("Name = " + name);
		
		return true;
	}
	
}
