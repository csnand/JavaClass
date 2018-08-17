import java.awt.Color;

public class Lion extends Cat {
	
    public Lion(String name, byte gender, Color[] colours) {
        super(name, gender, colours);
    }

    public Lion(String name, byte gender, int age, Color[] colours) {
        super(name, gender, age, colours);  
    }
    
    public Lion(byte gender, int age) {
        super(gender, age);
    }
    
    public void sleep() {
//        super.sleep();
//        super.sleep();
    	System.out.println("Sleeps!");
    	System.out.println("Sleeps!");
    }
    
//    public void attack(Animal a) {
//
//    }
    
    public void roar() {
        System.out.println("The Lion Roars!");
    }

    public void purr(){
        System.out.println("The Lion Purrs!");
    }


}