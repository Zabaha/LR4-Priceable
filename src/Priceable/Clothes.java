package Priceable;

public class Clothes  implements Priceable{
    private String brand;
    private String type;
    private int price;

    public Clothes(String brand, String type, int price){
        this.brand = brand;
        this.type = type;
        this.price = price;
    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String info() {
        return "Бренд: " + brand + "; тип одежды: " + type + "; Цена: " + price;
    }


}
