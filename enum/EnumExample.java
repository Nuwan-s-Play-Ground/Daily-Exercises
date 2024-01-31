// Define a simple enum for days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Using enums in a switch statement
        Day today = Day.TUESDAY;

        System.out.println(today.getClass());
        System.out.println(today.getClass().getSuperclass());

        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday!");
                break;
            case SUNDAY:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("Invalid day!");
        }

        // Iterating over all enum values
        System.out.println("\nDays of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        
    }
}
