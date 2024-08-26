import java.util.Scanner;
import Package.ClassProduct;

public class AtividadePedro7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClassProduct product = new ClassProduct();

        System.out.println("Enter product data: ");
        System.out.print("Enter product name: ");
        product.name = sc.nextLine();
        System.out.print("Enter product price: ");
        product.price = sc.nextDouble();
        System.out.print("Enter product quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(" Product name =  " + product.name + "\n Product price = " + product.price + "\n Product quantity = " + product.quantity);

        System.out.println("Total value in stock : " + product.TotalValueInStock());

        System.out.println("Adicionar itens no estoque: ");
        product.AddProducts(sc.nextInt());

        System.out.println("Total value in stock : " + product.TotalValueInStock());

        System.out.println("Remover itens no estoque: ");
        product.RemoveProducts(sc.nextInt());

        System.out.println("Total value in stock : " + product.TotalValueInStock());































    sc.close();
    }
}
