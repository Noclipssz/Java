import Package.Employee;

import java.util.Scanner;
public class AtividadePedro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Salary: ");
        emp.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.Tax = sc.nextDouble();

        System.out.println("Employ: " + emp.name + ", $ " + emp.NetSalary());

        System.out.print("Which percentage to increase salary? ");
        emp.IncreaseSalary(sc.nextDouble());
        System.out.println("\nUpdate data: " + emp.name + ", $ " + emp.NetSalary());

        sc.close();
    }
}
