enum Status {
    Running, Failed, Succesful;
}


public class JavaEnum{
    public static void main(String[] args) {

        Status[] s1 = Status.values();
        for (Status s:s1) {
            System.out.println(s + ":" + s.ordinal());
            
        }
    }
}