package entities;

public class Product {

    public String name;
    public double price;
    public int quantify;

    public double totalValueStock(){
        return price * quantify;
    }

    public void addProducts(int quantify){
        this.quantify += quantify;
    }

    public void removeProducts(int quantify){
        this.quantify -= quantify;
    }

    public String toString(){
        return name
             + ", $ "
             + String.format("%.2f", price)
             + ", "
             + quantify
             + " units, Total: $ "
             + String.format("%.2f", totalValueStock());

    }

}
