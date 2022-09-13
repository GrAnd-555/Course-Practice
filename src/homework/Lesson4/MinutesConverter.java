package homework.Lesson4;

public class MinutesConverter {
    public static void main(String[] args){
        long minutes = 425295837230L;
        double days;
        double years;
        years = minutes / 525_600;
        days = minutes % years / 1440;
        System.out.println("In " + minutes + " minutes are : " + (int)years + " years and " + (int)days + " days.");
    }
}
