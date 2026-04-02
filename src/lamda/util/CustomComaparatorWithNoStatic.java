package lamda.util;

import lamda.entity.Employee;

public class CustomComaparatorWithNoStatic {

    public  int CompareByName(Employee a, Employee b) {
        return a.getName().compareTo(b.getName());
    }

    public  int CompareByMarks(Employee a, Employee b) {
        return a.getMarks() - b.getMarks();
    }
}
