package org.cc;



import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static String getMessage() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {

        System.out.println(App.class.getPackage().getImplementationVersion());

    }

    /*private static void extracted() {
        String apiName = getAPIName("/sap/services/equipment/get-equipment-trace/2.0");
        System.out.println(apiName);
        List<Employee> employeeList = EmployeeData.getEmployees();
        Map<String, Optional<Integer>> secondHighestSalaryByDept = employeeList
                .stream()
                .collect(groupingBy(
                        Employee::getDepartment,
                        mapping(Employee::getSalary,
                                collectingAndThen(toList(),
                                        list -> list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst())))
                );
        Map<String, List<Integer>> salaryList = employeeList
                .stream()
                .collect(groupingBy(Employee::getDepartment, mapping(Employee::getSalary, toCollection(ArrayList::new))));
        System.out.println(salaryList);
        System.out.println(secondHighestSalaryByDept);
    }
*/
    private static String getAPIName(String requestUri) {
        String regex = "/services/(.*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(requestUri);
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                return matcher.group(1);
            }
        }
        return "";
    }

}
