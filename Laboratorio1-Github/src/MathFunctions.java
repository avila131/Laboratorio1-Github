public class MathFunctions {
    public static int multiplyNumber(int a, int b) {
        return a * b;
    }
    public static int divideNumber(int a, int b) {
        return a / b;
    }

    public static int sumNumber(int a, int b) {
        return a + b;
    }

    public static int powNumber(int a, int exp) { 
        return a**exp; 
    }
    public static int subNumber(int a, int b) {
        return a - b;
    }
    public static int factorial(int a){
        return (a == 1 || a == 0) ? 1 : a * factorial(a - 1);
    }
}
