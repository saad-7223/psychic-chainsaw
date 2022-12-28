package p7;

import java.lang.*;

abstract class Employee {
    String name;
    double basic_sal, da, hra, it;

    Employee(String n, double b) {
        name = n;
        basic_sal = b;
        da = basic_sal * 0.7;
        hra = basic_sal * 0.3;
        it = basic_sal * 0.4;
    }

    abstract double gross_sal();
}

class Manager extends Employee {
    double inc;
    Manager(String n, double b) {
        super(n, b);
    }

    double gross_sal() {
        inc = basic_sal * 0.1;
        double gross = basic_sal + da + hra - it + inc;
        System.out.println("Employee name: " + name);
        System.out.println("Designation: Manager");
        System.out.println("Basic of Employee: " + basic_sal);
        System.out.println("DA of Employee: " + da);
        System.out.println("HRA of Employee: " + hra);
        System.out.println("IT of Employee: " + it);
        System.out.println("Annual Increment of Employee: " + inc + "\n");
        return gross;
    }
}

public class Technician extends Employee {
    double inc;

    Technician(String n, double b) {
        super(n, b);
    }

    double gross_sal() {
        inc = basic_sal * 0.15;
        double gross = basic_sal + da + hra + it + inc;
        System.out.println("Employee name: " + name);
        System.out.println("Designation: Technician");
        System.out.println("Basic of Employee: " + basic_sal);
        System.out.println("DA of Employee: " + da);
        System.out.println("HRA of Employee: " + hra);
        System.out.println("IT of Employee: " + it);
        System.out.println("Annual Increment of Employee: " + inc + "\n");
        return gross;
    }

    public static void main(String[] args) {
        Manager m = new Manager("anil", 4000);
        Technician t1 = new Technician("Ram", 500);
        Technician t2 = new Technician("Shyam", 1000);
        Technician t3 = new Technician("shiv", 1500);
        Technician t4 = new Technician("gopal", 2000);
        Employee e;
        e = m;
        System.out.println("Gross Salary " + e.gross_sal() + "\n");
        e = t1;
        System.out.println("Gross Salary " + e.gross_sal() + "\n");
        e = t2;
        System.out.println("Gross Salary " + e.gross_sal() + "\n");
        e = t3;
        System.out.println("Gross Salary " + e.gross_sal() + "\n");
        e = t4;
        System.out.println("Gross Salary " + e.gross_sal() + "\n");
    }
}
