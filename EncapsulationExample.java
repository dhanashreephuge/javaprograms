package encapsulation;

//Employee class with private fields and public methods to access and modify them
class Employee {
 private String name;
 private int age;
 private double salary;

 // Getter method to retrieve the name
 public String getName() {
     return name;
 }

 // Setter method to set the name
 public void setName(String name) {
     this.name = name;
 }

 // Getter method to retrieve the age
 public int getAge() {
     return age;
 }

 // Setter method to set the age
 public void setAge(int age) {
     if (age > 0) {
         this.age = age;
     } else {
         System.out.println("Age cannot be negative or zero.");
     }
 }

 // Getter method to retrieve the salary
 public double getSalary() {
     return salary;
 }

 // Setter method to set the salary
 public void setSalary(double salary) {
     if (salary > 0) {
         this.salary = salary;
     } else {
         System.out.println("Salary cannot be negative or zero.");
     }
 }
}

public class EncapsulationExample {
 public static void main(String[] args) {
     // Creating an instance of the Employee class
     Employee emp = new Employee();

     // Setting values using setter methods
     emp.setName("John");
     emp.setAge(30);
     emp.setSalary(50000.0);

     // Getting and printing values using getter methods
     System.out.println("Employee Name: " + emp.getName());
     System.out.println("Employee Age: " + emp.getAge());
     System.out.println("Employee Salary: " + emp.getSalary());
 }
}
