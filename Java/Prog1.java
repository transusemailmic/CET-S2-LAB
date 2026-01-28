class Product{
    int pcode;
    String pname;
    double price;
    Product(int pcode,String pname,double price){
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
}
public class Prog1{
    public static void main(String args[]){
        Product p1=new Product(1,"Keyboard",350.00);
        Product p2=new Product(2,"Mouse",300.00);
        Product p3=new Product(3,"Monitor",3500.00);
        Product lowest=p1;
        if(p2.price<lowest.price)
            lowest=p2;
        if(p3.price<lowest.price)
            lowest=p3;
        System.out.println("Product with lowest price: ");
        System.out.println("Product Code: "+lowest.pcode);
        System.out.println("Product Name: "+lowest.pname);
        System.out.println("Product Price: "+lowest.price);
    }
}
