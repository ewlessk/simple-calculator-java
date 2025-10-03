public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("5 - 2 = " + subtract(5, 2));
    }
    public static int multiply(int a, int b) {
    return a * b;
}
public static double divide(int a, int b) {
    if (b == 0) throw new IllegalArgumentException("На ноль делить нельзя");
    return (double) a / b;
}
public static int mod(int a, int b) {
    return a % b;
}

}
