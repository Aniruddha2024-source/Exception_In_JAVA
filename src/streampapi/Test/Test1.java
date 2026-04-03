package streampapi.Test;

import lamda.entity.Employee;
import lamda.util.GeneratorUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("<-----Input------>");
        List<Employee> employeeList = GeneratorUtil.populateEmployees();
        employeeList.forEach(employee -> { System.out.println(employee);});
//        for(Employee employee: employeeList){
//            System.out.println(employee);
//        }

        List<Employee> filteredlist = new ArrayList<>();


        employeeList.forEach(employee -> {if(employee.getMarks() <= 45) {
            filteredlist.add(employee);
        }});
//        for(Employee employee: employeeList){
//            if(employee.getMarks() <= 45 ) {
//               filteredlist.add(employee);
//            }
//        }

        Collections.sort(filteredlist, (o1,  o2) -> {
                return o1.getName().compareTo(o2.getName());
            });

        System.out.println("<-----Filtered Output------>");

        filteredlist.forEach(System.out::println); // using method reference
//        for(Employee employee: filteredlist){
//            System.out.println(employee);
//        }



    }
}
