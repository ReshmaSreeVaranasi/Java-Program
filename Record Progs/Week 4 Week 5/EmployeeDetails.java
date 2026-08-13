package javacore;
class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    Employee() {
        name = "Unknown";
        id = 0;
        designation = "Not Assigned";
        salary = 0;
        promotionStatus = "Not Decided";
    }

   
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Not Assigned";
        salary = 0;
        promotionStatus = "Not Decided";
    }
    Employee(String name, int id, String designation,
             double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Promotion Status: " + promotionStatus);
        System.out.println();
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Ravi", 101);

        Employee e3 = new Employee(
                "Anil", 102, "Manager", 50000, "Promoted"
        );

        e1.display();
        e2.display();
        e3.display();
    }
}
Name: Ramesh
ID: 99
Designation: Manager
Salary: 50000.0
Promotion Status: Yes

Name: Lalitha
ID: 101
Designation: Asst Manager
Salary: 40000.0
Promotion Status: Yes

Name: Anil
ID: 102
Designation: Manager
Salary: 50000.0
Promotion Status: Promoted


