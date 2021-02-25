package se.jocke.employee.api.model;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.jocke.api.EmployeeModel;
import se.jocke.department.builder.EmployeeModelTestBuilder;

public class TestCreateEmployeeModel {
    private final EmployeeModel EMPLOYEE_MODEL = EmployeeModelTestBuilder.builder().build();


    @Test
    public void testCreateEmployeeModel() {
        EmployeeModel employee = EmployeeModel.builder()
                .employeeId(EMPLOYEE_MODEL.getEmployeeId())
                .employeeName(EMPLOYEE_MODEL.getEmployeetName())
                .build();

        Assertions.assertEquals(EMPLOYEE_MODEL.getEmployeeName(), employee.getEmployeeName());
        Assertions.assertEquals(EMPLOYEE_MODEL.getEmployeeId(), employee.getEmployeeId());
        Assertions.assertEquals(EMPLOYEE_MODEL,employee);
    }

    @Test
    public void testCreateEmployeeModelThrowsException() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            EmployeeModel.builder().employeeName(EMPLOYEE_MODEL.getEmployeeName()).build();
        });
    }
}
