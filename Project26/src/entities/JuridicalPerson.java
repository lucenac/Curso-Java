package entities;

public class JuridicalPerson extends LegalEntity{
    private Integer employeesNumber;

    public JuridicalPerson() {
        super();
    }

    public JuridicalPerson(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double taxes() {
        double total;
        if (employeesNumber >= 10) {
            total = getAnnualIncome() * 0.14;
        }
        else {
            total = getAnnualIncome() * 0.16;
        }

        return total;
    }
}
