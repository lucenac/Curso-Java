package entities;

public class Employee {

    public String name;
    public double gs;
    public double t;
    public double increseSalary;
    public double netSalary(double gs, double t){
        return gs - t;
    }
    public void increseSalary(double percentage){
        increseSalary = (gs - t) + (gs * (percentage / 100.0));
    }
    public String toString() {
        return "Updated data: "
                + name
                + ", $ "
                + String.format("%.2f",increseSalary);
    }
}
