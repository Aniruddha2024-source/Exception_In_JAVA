package streampapi.util;

import lamda.entity.Employee;
import java.util.ArrayList;
import java.util.List;

public class GeneratorUtil {

    public static List<Employee> populateEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Aniruddha", 40));
        employeeList.add(new Employee(12,"Ananya", 42));
        employeeList.add(new Employee(4,"Anirban", 45));
        employeeList.add(new Employee(15,"Alapan", 40));
        employeeList.add(new Employee(29,"Jimmy", 53));
        employeeList.add(new Employee(20,"Suvojit", 58));
        return employeeList;
    }

}
