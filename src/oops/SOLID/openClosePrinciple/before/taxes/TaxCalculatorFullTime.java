package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalculatorFullTime implements ITaxCalculator{

    private int PROFESSIONAL_TAX_PERCENTAGE = 30;
    private int INCOME_TAX_PERCENTAGE = 2;
    private int EDUCATION_CESS = 1;

    @Override
    public double calculate(Employee employee) {
        return
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                        (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
                        (employee.getMonthlyIncome() * EDUCATION_CESS) / 100;
    }
}