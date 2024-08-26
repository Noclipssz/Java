package Package;

public class ClassProduct {
    public String name;
    public Double price;
    public int quantity;






    public double TotalValueInStock() {
        return quantity * price;
    }
    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }
    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }


}

