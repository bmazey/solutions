package fundamentals;

public class PrimitiveTypeCastExample {
    public static void main(String[] args) {
        double d = 100.5;
        int i = (int)d; //explicit casting required here!
        double dd = i; //implicit casting
        System.out.println("original double value: " + d);
        System.out.println("integer value: " + i);
        System.out.println("new double value: " + dd);
    }
}
