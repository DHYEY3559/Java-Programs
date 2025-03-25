class Member {
    String name;
    int age;
    String phone;
    String address;
    double salary;

    public Member(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phone, String address, double salary, String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
        System.out.println(" ");
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String phone, String address, double salary, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
        System.out.println(" ");
    }
}

public class P4 {
    public static void main(String[] args) {
        // Creating Employee Object
        Employee emp = new Employee("Rahul Sharma", 30, "9876543210", "Ahmedabad, India", 50000, "Software Development");

        // Creating Manager Object
        Manager mgr = new Manager("Priya Patel", 40, "9123456789", "Surat, India", 80000, "IT Department");

        // Displaying Employee and Manager details
        emp.displayDetails();
        mgr.displayDetails();
    }
}