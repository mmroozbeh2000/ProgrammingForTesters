package se.jocke.employee.api.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.jocke.api.EmployeeModel;
import se.jocke.employee.builder.EmployeeModelTestBuilder;

public class TestCreateEmployeeModel {
    private final EmployeeModel EMPLOYEE_MODEL = EmployeeModelTestBuilder.builder().build();

    @Test
    public void testCreateEmployeeModel() {
        System.out.println(EMPLOYEE_MODEL.toString());

        EmployeeModel model = EmployeeModel.builder()
                .employeeId(EMPLOYEE_MODEL.getEmployeeId())
                .firstName(EMPLOYEE_MODEL.getFirstName())
                .lastName(EMPLOYEE_MODEL.getLastName())
                .salary(EMPLOYEE_MODEL.getSalary())
                .fullTime(EMPLOYEE_MODEL.getFullTime())
                .departmentId(EMPLOYEE_MODEL.getDepartmentId())
                .build();
        System.out.println(model.toString());

        Assertions.assertEquals(EMPLOYEE_MODEL.getEmployeeId(), model.getEmployeeId());
        Assertions.assertEquals(EMPLOYEE_MODEL.getFirstName(), model.getFirstName());
        Assertions.assertEquals(EMPLOYEE_MODEL.getLastName(), model.getLastName());
        Assertions.assertEquals(EMPLOYEE_MODEL.getSalary(), model.getSalary());
        Assertions.assertEquals(EMPLOYEE_MODEL.getFullTime(), model.getFullTime());
        Assertions.assertEquals(EMPLOYEE_MODEL.getDepartmentId(), model.getDepartmentId());

    }

    // TODO Need an explanation. Don't understand this
    @Test
    public void testCreateEmployeeModelThrowsException() {
        Assertions.assertThrows(NullPointerException.class, () ->{
            EmployeeModel.builder().firstName(EMPLOYEE_MODEL.getFirstName()).build();
        });
    }
}
