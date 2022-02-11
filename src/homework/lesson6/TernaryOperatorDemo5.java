package homework.lesson6;

public class TernaryOperatorDemo5 {

    public static void main(String[] args) {
        int colorCode = 101;
        String color = (colorCode == 100) ? "Yellow" : (colorCode == 101) ?
                "Green" : (colorCode == 102) ? "Red" : "Invalid";

        System.out.println("Color ---&gt; " + color);
    }

}
