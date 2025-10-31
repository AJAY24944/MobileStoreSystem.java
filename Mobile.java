public class Mobile {
    static String storeName = "Tech World";
    String Brand;
    int Price;
    public void showDetails() {
        System.out.println("Store Name : " + storeName);
        System.out.println("Mobile Brand : " + Brand);
        System.out.println("Mobile Price : " + Price);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.Brand = "Apple";
        obj1.Price = 1200;

        obj2.Brand = "Samsung";
        obj2.Price = 900;

        obj1.showDetails();
        obj2.showDetails();
    }

}
