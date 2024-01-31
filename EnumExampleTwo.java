enum Laptop{
    HP(2000), Dell(3000), Azer(4000), Azus(6000);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public  int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}



public class EnumExampleTwo {
    public static void main(String[] args) {
        
       // Laptop lap = Laptop.HP;

        for (Laptop lap: Laptop.values()) {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}
