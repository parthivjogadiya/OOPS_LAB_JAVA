import java.util.Scanner;
class Invoice {
    
    private String partNum;
    private String partDescription;
    private int quantity;
    private double price;

    
    Invoice(String partNum, String partDescription, int quantity, double price) {
        this.partNum = partNum;
        this.partDescription = partDescription;
        setQuantity(quantity);   
        setPrice(price);        
    }

    

    void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }

    void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            this.price = 0.0;
    }

    

    String getPartNum() {
        return partNum;
    }

    String getPartDescription() {
        return partDescription;
    }

    int getQuantity() {
        return quantity;
    }

    double getPrice() {
        return price;
    }

    
    double getInvoiceAmount() {
        return quantity * price;
    }
};


public class lab2_2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the part number");
        String partNum=sc.nextLine();

        System.out.println("Enter the part Description");
        String partDescription=sc.nextLine();

        System.out.println("Enter the Quantity");
        int quantity=sc.nextInt();

        System.out.println("Enter the price of the part");
        double price=sc.nextDouble();

        Invoice i1=new Invoice(partNum,partDescription, quantity, price);

        double amount;
        amount=i1.getInvoiceAmount();
        System.out.println("The amount of the invoice is "+amount);

        sc.close();
    }
    
}
