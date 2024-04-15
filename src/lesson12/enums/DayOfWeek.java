package lesson12.enums;

public enum DayOfWeek {

    MONDAY(false, 8),
    TUESDAY(8),
    WEDNESDAY(8),
    THURSDAY(8),
    FRIDAY(6),
    SATURDAY(true, 6) {
        @Override
        public int getWorkingHours() {
            if (isWeekend()) {
                return 0;
            } else {
                return super.getWorkingHours();
            }
        }
    },
    SUNDAY(true, 0);


    private boolean weekend;
    private int workingHours;

    DayOfWeek() {
        this(false);
    }

    DayOfWeek(int workingHours) {
        this(false, workingHours);
    }

    DayOfWeek(boolean weekend) {
        this.weekend = weekend;
        this.workingHours = 0;
    }

    DayOfWeek(boolean weekend, int workingHours) {
        this.workingHours = workingHours;
        this.weekend = weekend;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public int getWorkingHours() {
        return workingHours;
    }
}
