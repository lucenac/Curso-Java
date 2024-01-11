package entities;

public class NaturalPerson extends LegalEntity{
    private Double healthExpenditures;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double taxes(){
        double total;

        if (getAnnualIncome() >= 20000) {
            if (healthExpenditures > 0) {
                total = (getAnnualIncome() * 0.25) - (healthExpenditures / 2);
            }
            else {
                total = getAnnualIncome() * 0.25;
            }
        }
        else {
            if (healthExpenditures > 0) {
                total = (getAnnualIncome() * 0.15) - (healthExpenditures / 2);
            }
            else {
                total = getAnnualIncome() * 0.15;
            }
        }

        return total;
    }
}
