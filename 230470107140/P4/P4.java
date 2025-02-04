class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    // Method to display member details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}

// Employee class inherits from Member
class Employee extends Member {
    String specialization;

    // Constructor
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Display Employee details
    public void displayEmployeeDetails() {
        displayDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("---------------------------------");
    }
}

// Manager class inherits from Member
class Manager extends Member {
    String department;

    // Constructor
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Display Manager details
    public void displayManagerDetails() {
        displayDetails();
        System.out.println("Department: " + department);
        System.out.println("---------------------------------");
    }
}


public class P4 {
    public static void main(String[] args) {
        // Creating Employee Object
        Employee emp = new Employee("Rahul Sharma", 30, "9876543210", "Ahmedabad, India", 50000, "Software Development");

        // Creating Manager Object
        Manager mgr = new Manager("Priya Patel", 40, "9123456789", "Surat, India", 80000, "IT Department");

        // Displaying Employee and Manager details
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();

        System.out.println("Manager Details:");
        mgr.displayManagerDetails();
    }

}
