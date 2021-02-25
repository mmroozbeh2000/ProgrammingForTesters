package se.jocke.employee.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.jocke.department.entity.Employee;
import se.jocke.employee.builder.EmployeeTestBuilder;

public class TestCreateEmployee {

    private final Employee EMPLOYEE = EmployeeTestBuilder.builder().build();

    @Test
    public void testCreateEmployee(){
        Employee employee = EmployeeTestBuilder.builder()
                .employeeId(EMPLOYEE.getEmployeeId())
                .departmentId(EMPLOYEE.getDepartmentId())
                .firstName(EMPLOYEE.getFirstName())
                .lastName(EMPLOYEE.getLastName())
                .fullTime(EMPLOYEE.getFullTime())
                .salary(EMPLOYEE.getSalary())
                .build();

        Assertions.assertEquals(EMPLOYEE, employee);
        Assertions.assertEquals(EMPLOYEE.getEmployeeId(),employee.getEmployeeId() );
        Assertions.assertEquals(EMPLOYEE.getDepartmentId(),employee.getDepartmentId() );
        Assertions.assertEquals(EMPLOYEE.getFirstName(),employee.getFirstName() );
        Assertions.assertEquals(EMPLOYEE.getLastName(),employee.getLastName() );
        Assertions.assertEquals(EMPLOYEE.getFullTime(),employee.getFullTime() );
        Assertions.assertEquals(EMPLOYEE.getSalary(),employee.getSalary() );

    }

    @Test
    public void testCreateEmployeeThrowsException(){
        Assertions.assertThrows(NullPointerException.class, () ->{
            Employee.builder().firstName(EMPLOYEE.getFirstName()).build();
        });
    }

}
