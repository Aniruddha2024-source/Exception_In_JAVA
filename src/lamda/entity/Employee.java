package lamda.entity;

import java.util.PrimitiveIterator;

public class Employee {
    private int id;
    private String Name;
    private int marks;

    public Employee(int id, String name, int marks) {
        this.id = id;
        this.Name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
