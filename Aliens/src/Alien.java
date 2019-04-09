//Classes are like instructions for how objects should behave. "Blueprint".
public class Alien {
	//This creates aliens for my world.
	String name;
	int age;
	int weight;
	int numEyes;
	String eyecolor;
	boolean good;
	
	//constructor, same EXACT NAME as class
	public Alien(String name, int age, int weight, int numEyes, String eyecolor, boolean good) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.numEyes = numEyes;
		this.eyecolor = eyecolor;
		this.good = good;
	}

	public void weclomeSpeech() {
		System.out.println("Welcome to my planet earthling!!");
		System.out.println("Where do you come from?");
		System.out.println("I have " + numEyes + " eyes and I am a good guy.");
	}
	
	public void eat() {
		System.out.println("..eating..");
	}
	
	public void run() {
		System.out.println("..running");
	}
	
	public void work() {
		System.out.println("..working..");
	}
}
	
	
