package Package;

public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary() {
        return (GrossSalary - Tax);
    }
    public void IncreaseSalary(Double percentage) {
        this.GrossSalary += (GrossSalary / percentage);
    }
}
