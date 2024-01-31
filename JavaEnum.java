enum Status {
    Running, Failed, Succesful;
}


public class JavaEnum{
    public static void main(String[] args) {

        Status[] s1 = Status.values();

        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getSuperclass());

        Status s2 = Status.Failed;

        System.out.println(s2.getClass());
        System.out.println(s1.getClass().getSuperclass());

        switch (s2) {
            case Running:
            System.out.println("It's running");
            break;
            
            case Failed:
            System.out.println("It has failed");
            break;

            case Succesful:
            System.out.println("It is successful");
            break;

            default:
            System.out.println("No status");
        }

        for (Status s:s1) {
            System.out.println(s + ":" + s.ordinal());
            
        }
    }
}