// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Java_Assignment;

class IT {
    private String name;
    IT(String name) {
        this.name = name;
    }
    public String getITName() {
        return this.name;
    }
}
class Employee {
    private String name;
    Employee(String name) {
        this.name = name;
    }
    public String getEmployeeName() {
        return this.name;
    }
}
public class Pr_12 {
    public static void main(String[] args) {
        IT it = new IT("TCS");
        Employee emp = new Employee("Divy Sheta");
        System.out.println(emp.getEmployeeName() + " is employee of " + it.getITName());
    }
}
