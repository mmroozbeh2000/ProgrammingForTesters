package se.jocke.employee.api.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.jocke.api.EmployeeModel;
import se.jocke.api.mapper.EmployeeModelMapper;
import se.jocke.employee.builder.EmployeeModelTestBuilder;
import se.jocke.employee.builder.EmployeeTestBuilder;
import se.jocke.department.entity.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Mio
 *
 * Kopierat och ändrat från Department, alla test failar
 */
public class TestModelMapper {
    private final EmployeeModel EMPLOYEE_MODEL = EmployeeModelTestBuilder.builder().build();
    private final Employee EMPLOYEE = EmployeeTestBuilder.builder().build();

    @Test
    public void testEmployeeToEmployeeModelMapping() {
        EmployeeModel model = EmployeeModelMapper.map(EMPLOYEE);
        Assertions.assertAll(
                () -> assertEquals(EMPLOYEE.getEmployeeId(), model.getEmployeeId()), // expected: <EntityID(id=100)> but was: <100>
                () -> assertEquals(EMPLOYEE.getFirstName(), model.getFirstName()),
                () -> assertEquals(EMPLOYEE.getLastName(), model.getLastName()),
                () -> assertEquals(EMPLOYEE.getSalary(), model.getSalary()),
                () -> assertEquals(EMPLOYEE.getFullTime(), model.getFullTime()),
                () -> assertEquals(EMPLOYEE.getDepartmentId(), model.getDepartmentId())
        );
    }

    @Test
    public void testDepartmentModelToDepartmentMapping() {
        Employee employee = EmployeeModelMapper.map(EMPLOYEE_MODEL);
        Assertions.assertAll(
                () -> assertEquals(EMPLOYEE_MODEL.getEmployeeId(), employee.getEmployeeId()),
                () -> assertEquals(EMPLOYEE_MODEL.getFirstName(), employee.getFirstName()),
                () -> assertEquals(EMPLOYEE_MODEL.getLastName(), employee.getLastName()),
                () -> assertEquals(EMPLOYEE_MODEL.getSalary(), employee.getSalary()),
                () -> assertEquals(EMPLOYEE_MODEL.getFullTime(), employee.getFullTime()),
                () -> assertEquals(EMPLOYEE_MODEL.getDepartmentId(), employee.getDepartmentId())
        );
    }
}
