package debugging.practice;



/*
Questions
Will this compile?
If not, why?
How to fix properly?

class Employee{
    private int salary = 50000;
}

public class AccessModifierProblem {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.salary);
    }
}
* */

//fix
class Employee{
    private int salary = 50000;

    public int getSalary() {
        return salary;
    }
}

public class AccessModifierProblem {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getSalary());
    }
}
