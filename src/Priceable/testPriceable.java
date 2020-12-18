package Priceable;

public class testPriceable {

    public static void main(String[] args) {
        Priceable c1 = new Car("audi", 1885000);
        Priceable clothes = new Clothes("zara", "пальто", 5499);
        Priceable GC = new Graphics_card("TU116", 23999);
        System.out.println(c1.getPrice());
        System.out.println(c1.info());
        System.out.println(clothes.getPrice());
        System.out.println(clothes.info());
        System.out.println(GC.getPrice());
        System.out.println(GC.info());
    }
}
