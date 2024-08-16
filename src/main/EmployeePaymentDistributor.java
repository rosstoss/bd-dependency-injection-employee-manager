package main;

import javax.inject.Inject;
import java.math.BigDecimal;

public class EmployeePaymentDistributor {
    private PayrollTracker payrollTracker;

    /**
     * Constructor for main.Employee class.
     */
    @Inject
    public EmployeePaymentDistributor() {
        this.payrollTracker = new PayrollTracker();
    }

    /**
     * Pay an employee.
     * @return the current updated of the Payroll account
     */
    public BigDecimal payEmployee(Employee employee) {
        return payrollTracker.payEmployee(employee);
    }

    /**
     * Check if we have paid an employee.
     * @param employee the employee to check if we have paid
     * @return true if the employee has been paid, false otherwise
     */
    public boolean employeeHasBeenPaid(Employee employee) {
        return payrollTracker.getPaidEmployees().contains(employee);
    }
}
