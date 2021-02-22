package se.jocke.department.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@SuperBuilder
@Getter
@EqualsAndHashCode
@ToString
public class Employee extends Entity<EmployeeID> {
    private final @NonNull EmployeeID employeeId; // Var finns getEmployeeId()?
    private final @NonNull String firstName;
    private final @NonNull String lastName;
    private final @NonNull BigDecimal salary;
    private final @NonNull Boolean fullTime;
    private final @NonNull Integer departmentId;
}
