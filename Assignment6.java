public class Animal {
    public int age;
    public String gender;

    public boolean isMammal() {
        System.out.println("Determining if it's a mammal.");
        return true;
    }

    public void mate() {
        System.out.println("Finding a mate.");
    }
    public static void main(String [] args) {
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();
        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();
    }
}
class Fish extends Animal {
    private int sizeInFeet;
    public Fish() {
        this.sizeInFeet = 1;
    }
    public Fish(int sizeInFeet) {
        this.sizeInFeet = sizeInFeet;
    }

    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish");
    }
}
class Zebra extends Animal {
    public boolean is_wild;

    public void run() {
        System.out.println("This Zebra is running!");
    }
}

