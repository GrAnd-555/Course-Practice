package homework.lesson10;

public class ConvertStringToPrimitive {
    public static void main(String[] args) {
       Boolean b1 = new Boolean("tRue");
        System.out.println(b1);

        Byte byteWrap = new Byte("120");
        System.out.println(byteWrap);

        Short shortWrap = new Short("32000");
        System.out.println(shortWrap);

        Integer integer = new Integer("147895632");
        System.out.println(integer);

        Long longWrap = new Long("987654321987654321");
        System.out.println( longWrap);

        Double doubleWrap = new Double("4444.5d");
        System.out.println(doubleWrap);

        Float floatWrap = new Float("2345.56f");
        System.out.println(floatWrap);
    }
}
//Create a program to convert the following String values to the appropriate primitive data types (by using Wrapper classes):
//
//"tRue" -> boolean
//"120" -> byte
//"32000" -> short
//"147895632" -> int
//"987654321987654321" -> long
//"4444.5d" -> double
//"2354.56f" -> float
