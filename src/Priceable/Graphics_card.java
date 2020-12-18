package Priceable;

public class Graphics_card implements Priceable{
    private String GPU;
    private int price;

    public Graphics_card(String GPU, int price){
        this.GPU = GPU;
        this.price = price;
    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String info() {
        return "Графический процессор: " + GPU + "; Цена: " + price;
    }
}
