package org.builder;

import org.builder.domain.Address;
import org.builder.domain.Phone;

public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee.EmployeeBuilder()
            .setName("Juan")
            .setAge(45)
            .setGender("Fluido")
            .setAddress("Avenida Siempreviva 123", "Springfield", "USA", "5000")
            .setPhone("3812555856", "+45", "cellphone")
            .setContact("Lenny", new Phone("3812555856", "+45", "cellphone"), new Address("Avenida Siempreviva 123", "Springfield", "USA", "5000"))
            .build();
        System.out.println(employee);
    }

}