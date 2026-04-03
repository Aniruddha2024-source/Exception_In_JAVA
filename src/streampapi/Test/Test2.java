package streampapi.Test;

import lamda.entity.Employee;
import lamda.util.GeneratorUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("<-----Input------>");
        List<Employee> employeeList = GeneratorUtil.populateEmployees(); //source
        employeeList.forEach( System.out::println);


//        Stream<Employee> EmployeeStream =  employeeList.stream();
//        Stream<Employee> filteredstream = EmployeeStream.filter(employee -> employee.getMarks() <= 45);
//        Stream<Employee> sortedstream = filteredstream.sorted(( o1,  o2) -> {return o1.getName().compareTo(o2.getName());});
//        sortedstream.forEach(System.out::println);

        System.out.println("<-----output------>");

        employeeList.stream(). // intermediate stage
                filter(employee -> employee.getMarks() <= 45) // intermediate stage
                .sorted(( o1,  o2) -> {return o1.getName().compareTo(o2.getName());}) // intermediate
                .forEach(System.out::println); // terminal stage


    }
}
