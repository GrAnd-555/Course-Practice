package homework.lesson10;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekday() {
        return (this != SATURDAY && this != SUNDAY);
    }

    public boolean isHoliday(){
        return (this == SATURDAY || this == SUNDAY);
    }
}
//Create a enum named Weekday that would keep the days of the week: MONDAY, TUESDAY… SUNDAY.
// Define two methods in the enumeration: isWeekDay () and isHoliday (), both of the boolean return type,
// which must indicate whether the value in the enumeration, on which one of these methods was invoked,
// is a business day or a weekend day. For example, the next call should display true.
//		System.out.println(Weekday.MONDAY.isWeekday());  // true