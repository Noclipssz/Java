package Package;

import java.util.Scanner;

public class Rectangle {
    public double Width;
    public double Height;

    public double Area() {
        return Width * Height;
    }

    public double Perimeter() {
        return 2 * (Width + Height);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
    }

    public  void  Ler(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        this.Width = sc.nextDouble();
        System.out.print("Enter the height: ");
        this.Height = sc.nextDouble();
        System.out.println(write());
    }

    public String write(){
       return "Area = " + Area()
               + "\nPerimeter = " + Perimeter()
               + "\nDiagonal = " + Diagonal();
    }

}

