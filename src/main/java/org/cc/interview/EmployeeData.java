package org.cc.interview;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>(100);
        Faker faker = new Faker();

        for (int i = 1; i <= 100; i++) {
            Employee employee =
                    new Employee(i,
                            faker.name().firstName(),
                            faker.name().lastName(),
                            faker.internet().emailAddress(),
                            faker.number().numberBetween(10000, 90000),
                            faker.job().position());
            employees.add(employee);
        }

        return employees;
    }
}
