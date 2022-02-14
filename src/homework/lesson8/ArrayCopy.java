package homework.lesson8;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] originalArray = {432, 534, 654, 213, 876, 22, 54, 76};
        int[] copyOfArray = new int[originalArray.length];
        for (int i = 0, j = 0; i < originalArray.length; i++, j++) {
            copyOfArray[j] = originalArray[i];
        }
        for (int intermediate : copyOfArray) {
            System.out.print(intermediate + " ");
        }
    }
}
