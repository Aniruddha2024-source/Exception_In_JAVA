package lamda.Test;

//import lamda.service.impl.ServiceImpl;

import lamda.entity.Employee;
import lamda.util.CustomComaparator;
import lamda.util.CustomComaparatorWithNoStatic;
import lamda.util.GeneratorUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test8 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.populateEmployees();
        CustomComaparatorWithNoStatic customComaparatorWithNoStatic = new CustomComaparatorWithNoStatic();
        System.out.println("Sorted by Name: ");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return customComaparatorWithNoStatic.CompareByMarks(o1,o2);
//
            }
        });
        for(Employee employee: employeeList) {
            System.out.println(employee);
        }

        System.out.println("Sorted by Name: ");
        Collections.sort(employeeList, ( o1,  o2) -> {
            return o1.getMarks() - o2.getMarks();});
        for(Employee employee: employeeList) {
            System.out.println(employee);
        }


    }
}
