import java.util.Scanner;

class member{
    String name,address;
    int age,phone,salary;

    public void printSalary(){
        System.out.println("Salary: "+salary);
    }

    public void enterDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Address: ");
        address = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter Phone: ");
        phone = sc.nextInt();
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
    }

    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
        System.out.println("Salary: "+salary);
    }
}

class manager extends member{
    String department,specialization;
    public void add(){
        Scanner sc = new Scanner(System.in);
        enterDetails();
        System.out.println("Enter Department: ");
        department = sc.nextLine();
        System.out.println("Enter Specialization: ");
        specialization = sc.nextLine();
    }
}

class Employee extends member{
    String department,specialization;
    public void add(){
        Scanner sc = new Scanner(System.in);
        enterDetails();
        System.out.println("Enter Department: ");
        department = sc.nextLine();
        System.out.println("Enter Specialization: ");
        specialization = sc.nextLine();
    }
}

//NewP4 is 'Company'
public class NewP4 {
    public static void main(String[] args) {
        manager m = new manager();
        System.out.println("Enter Manager Details: ");
        m.add();
        Employee e = new Employee();
        System.out.println("Enter Employee Details: ");
        e.add();

        System.out.println("Manager Details: ");
        m.printDetails();
        m.printSalary();

        System.out.println("Employee Details:");
        e.printDetails();
        e.printSalary();
    }
}
