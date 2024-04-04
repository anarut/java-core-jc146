package lesson10;

public class Phone {

    private int price;
    private String name;


    public Phone() {
    }

    public Phone(int price, String name) {
        setPrice(price);
        setName(name);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        if (price> 0) {
            this.price = price;
        } else {
            //error
            System.out.println("ай ай ай");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
