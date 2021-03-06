package interstellar.reflection;

import java.util.*;
import static net.mindview.util.Print.*;

class Employee {
    private String name;
    private double salary;
    private GregorianCalendar calendar;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }

        if (otherObject == null) {
            return false;
        }

        if (getClass() != otherObject.getClass()) {
            return false;
        }

        Employee other = (Employee) otherObject;

        return name.equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);

    }

    public int hashCode() {
        return 7 * name.hashCode() + 11 * new Double(salary).hashCode() + 13 * hireDay.hashCode();
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
    
    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }

        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * new Double(bonus).hashCode();

    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}

/**
 * EqualTest
 */
public class EqualTest {

    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);

        print("alice1 == alice2: " + (alice1 == alice2));
        print("alice1 == alice3: " + (alice1 == alice3));
        print("alice1.equals(alice3): " + alice1.equals(alice3));
        print("alice1.equals(bos): " + alice1.equals(bob));
        print("bob.toString: " + bob);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(500);

        print("boss.toString: " + boss);
        print("carl.equals(boss): " + carl.equals(boss));
        print("alice1.hashCode(): " + alice1.hashCode());
        print("alice3.hashCode(): " + alice3.hashCode());
        print("bob.hashCode(): " + bob.hashCode());
        print("carl.hashCode(): " + carl.hashCode());
    }
}