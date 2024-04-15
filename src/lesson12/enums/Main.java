package lesson12.enums;

public class Main {

    public static void main(String[] args) {
        DayOfWeek friday = DayOfWeek.FRIDAY;

        DayOfWeek friday1 = DayOfWeek.FRIDAY;

        boolean weekend = friday1.isWeekend();

        System.out.println(friday1 == friday);
        System.out.println(friday1.equals(friday));


        int workingHours = friday1.getWorkingHours();

        DayOfWeek dayOfWeek = DayOfWeek.valueOf("MONDAY");
        String name = dayOfWeek.name();
        int ordinal = dayOfWeek.ordinal();

        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("bydni");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("weekend");
//            default:
        }
    }
}
