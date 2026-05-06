package in.kgcoding.challenge97;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNSDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    Day(boolean dayType) {
        this.isWeekday = dayType;
    }
    public String daytype(){
        return (isWeekday)?"Weekday":"Weekend";
    }
}
