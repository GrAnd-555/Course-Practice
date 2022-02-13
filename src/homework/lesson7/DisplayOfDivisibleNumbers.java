package homework.lesson7;

public class DisplayOfDivisibleNumbers {
    public static void main(String[] args) {
        int lineCount = 1;
        for (int i = 100; i <= 1000; i++) {
            if (((i % 5) == 0) && ((i % 6) == 0)) {
                if ((lineCount % 10) == 0) {
                    System.out.println(i + " ");
                    lineCount = 0;
                } else
                    System.out.print(i + " ");
                ++lineCount;
            }

        }
    }
}
