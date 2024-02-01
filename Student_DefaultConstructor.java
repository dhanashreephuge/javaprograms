package constructor;
public class Student_DefaultConstructor {
    // Instance variables
    String name;
    int age;

    // Default constructor (provided by Java if notexplicitly defined)

    public Student_DefaultConstructor() {
        name = "Dhanashree";
        age = 23;
    }

    // Method to display student information
    public void displayInfo() {
    	System.out.println("Student Information \n"); 
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of the Student class using the default constructor
    	Student_DefaultConstructor myStudent = new Student_DefaultConstructor();

        // Calling a method to display student information
        myStudent.displayInfo();
    }
}
