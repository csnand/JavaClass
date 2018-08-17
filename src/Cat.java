import java.awt.Color;

public class Cat {
    public static final byte MALE = 0;
    public static final byte FEMALE = 1;
    
    private String name;
    private int age;
    private byte legs;
    private byte gender;
    private Color colours[];

    public Cat(String name, byte gender, Color[] colours) {

        this.name = name;
        this.gender = gender;
        this.colours = colours;
        
    }
    
    public Cat(String name, byte gender, int age, Color[] colours) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.colours = colours;
    }
    
    public Cat(byte gender, int age) {
        this.gender = gender;
        this.age = age;
    }
    
    public byte getGender() {
        return gender;
    }
    
    
    public int getCatYears() {
        return age;
    }
    
    public void sleep() {
    	System.out.println("Sleeps!");
    }

    public void purr(){
        System.out.println("The Cat Purrs!");
    }

    
}
