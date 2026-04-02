package lamda.util;

import lamda.entity.Employee;

public class CustomComaparator {
    private CustomComaparator() {
        // for this constructor we can not create a object of this class that also we don't need.
    }

    public static int CompareByName(Employee a, Employee b) {
        return a.getName().compareTo(b.getName());
    }

    public static int CompareByMarks(Employee a, Employee b) {
        return a.getMarks() - b.getMarks();
    }
}
