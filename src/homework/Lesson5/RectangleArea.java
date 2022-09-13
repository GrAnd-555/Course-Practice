package homework.Lesson5;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        System.out.println("Introduceti lungimea si latimea primului dreptunghi: ");
        Scanner newinput = new Scanner(System.in);
        int a = newinput.nextInt();
        int b = newinput.nextInt();
        System.out.println("Introduceti lungimea si latimea pentru al 2 lea dreptunghi: ");
        int c = newinput.nextInt();
        int d = newinput.nextInt();
        newinput.close();
        int s1 = a * b;
        int s2 = c * d;

        if (s1 == s2) {
            System.out.println("Ariile dreptunghirilor introduse sunt egale ! ");
        } else if (s1 > s2) {
            System.out.println("Aria primului dreptunghi introdus este mai mare si e egala cu: " + s1);
        } else {
            System.out.println("Aria celui de al 2 lea dreptunghi introdus este mai mare si e egala cu: " + s2);
        }

    }
}
