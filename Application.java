public class Application {
    
	
	public static void main(String[] args) 
	{
        // Create a Wizard object
        Wizard w = new Wizard("Dumbledore");

        // Set the key and lock the object
        w.setKey(987);
        w.lock(987);

        // Try taking damage while the object is locked
        w.takeDamage(30); // Locked object, no damage should be taken

        // Unlock the object and take damage
        w.unlock(987);
        w.takeDamage(20); // Health should be reduced by 20

        // Final state of the wizard
        System.out.println(w);
        System.out.println("Final state of the wizard:");
        System.out.println("Name: " + w.getName());
        System.out.println("Health: " + w.getHealth());
        System.out.println("Key: " + w.getKey());
        System.out.println("Locked: " + w.isLocked());
    }
}
