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
        full = (full / 3);
        sc.close();
    }
    public void display(){
    if (60 < full) {
        System.out.println("Final Grade: " + full);
        System.out.println("Pass");
    } else {
        System.out.println("Final Grade: " + full);
        System.out.println("Fail");
        System.out.println("Missing " +(full - 60) + "Point ");

    }


    }
}
