package Package;
import java.util.Scanner;

public class bimonthly {
    public String name;
    public double full;

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        full += sc.nextDouble();
        full += sc.nextDouble();
        full += sc.nextDouble();
        System.out.println("Points : " + full);
        System.out.println("Points : " + full);
        sc.close();
    }
    public void display(){
    if (60 < full) {
        System.out.println("Final Grade: " + full);
        System.out.println("Pass");
    } else {
        System.out.println("Final Grade: " + full);
        System.out.println("Fail");
        System.out.println("Missing " +(60 - full) + " Point ");
    }
    }

}
