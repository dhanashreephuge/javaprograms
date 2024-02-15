package polymorphismprog;
//Parent class
class Animal {
 // Method in the parent class
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass inheriting from Animal
class Dog extends Animal {
 // Overriding method in the subclass
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }
}

//Subclass inheriting from Animal
class Cat extends Animal {
 // Overriding method in the subclass
 @Override
 void makeSound() {
     System.out.println("Cat meows");
 }
}

public class Polymorphism {
 public static void main(String[] args) {
     // Creating objects of different classes
     Animal animal1 = new Animal();
     Animal animal2 = new Dog();
     Animal animal3 = new Cat();

     // Calling the makeSound() method of each object
     animal1.makeSound(); // Output: Animal makes a sound
     animal2.makeSound(); // Output: Dog barks
     animal3.makeSound(); // Output: Cat meows
 }
}
