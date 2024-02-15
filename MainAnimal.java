package interfaceconcept;

public class MainAnimal {
	public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling eat() and sleep() methods of Dog and Cat
        dog.eat();
        dog.sleep();
        cat.eat();
        cat.sleep();
    }
}