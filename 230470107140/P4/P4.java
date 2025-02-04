class Employee { 
    String name;
    int age;
    String phone;
    String address;
    double salary;
    String department;

    public Employee(String name, int age, String phone, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println(" ");
    }
}

class Manager extends Employee {
    public Manager(String name, int age, String phone, String address, double salary, String department) {
        super(name, age, phone, address, salary, department);
    }

    public void displayManagerDetails() {
        displayEmployeeDetails();
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