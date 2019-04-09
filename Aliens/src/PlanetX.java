
public class PlanetX {
	// This main methods is the entry point for all java applications. 
	public static void main(String args[]) {
		/* Before contstructor was created:
		Alien sypher;
		sypher = new Alien();
		sypher.age = 1001;
		sypher.good = true;
		sypher.numEyes = 5;
		sypher.weclomeSpeech();
		*/
		Alien biplo = new Alien("biplo", 4444, 3330, 4, "Orange", true);
		biplo.weclomeSpeech();
	}
}
