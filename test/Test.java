package test;

public class Test{
    public static void main(String[] args) {
        for(Object property : System.getProperties().keySet()){
            System.out.println(property);
        }
    }
}
