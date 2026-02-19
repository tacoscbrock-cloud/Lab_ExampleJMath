public class JMath {

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static long round(double x) {
        return Math.round(x);
    }

    public static double floor(double x) {
        return Math.floor(x);
    }

    public static double ceil(double x) {
        return Math.ceil(x);
    }

    public static double roundTo(double x, int decimals) {
        double p = Math.pow(10, decimals);
        return Math.round(x * p) / p;
    }

    public static int randomInt(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public static int clamp(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    public static int clip255(int value) {
        return clamp(value, 0, 255);
    }

    // ===================== MAIN METHOD =====================

    public static void main(String[] args) {

        double a = 2.3;
        double b = 2.7;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        System.out.println("min(a, b) = " + min(a, b));
        System.out.println("max(a, b) = " + max(a, b));
        System.out.println();

        System.out.println("round(a) = " + round(a));
        System.out.println("floor(a) = " + floor(a));
        System.out.println("ceil(a)  = " + ceil(a));
        System.out.println();

        System.out.println("roundTo(b, 2) = " + roundTo(b, 2));
        System.out.println();

        System.out.println("randomInt(5, 10) = " + randomInt(5, 10));
        System.out.println();

        System.out.println("clamp(270, 0, 255) = " + clamp(270, 0, 255));
        System.out.println("clip255(-10) = " + clip255(-10));
    }
}
