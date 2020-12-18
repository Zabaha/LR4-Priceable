package Priceable;

public class Car implements Priceable{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String info() {
        return "Марка: " + name + "; Цена: " + price;
    }
}
