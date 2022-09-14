package homework.lesson10;

public class EnumsTest {
    public static void main(String[] args) {
        for(MonthsOfYear intermediate : MonthsOfYear.values()){
            System.out.println(intermediate);
        }
        Weekday weekday = Weekday.MONDAY;
        System.out.println(weekday.isHoliday());

    }
}
