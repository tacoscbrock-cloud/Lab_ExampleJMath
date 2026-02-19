public class MinMaxRoundCeilDemo {

    public void run() {
        double a = 2.3;
        double b = 2.7;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        System.out.println("Math.min(a, b) = " + Math.min(a, b));
        System.out.println("Math.max(a, b) = " + Math.max(a, b));
        System.out.println();

        System.out.println("Math.floor(a) = " + Math.floor(a)); // 2.0
        System.out.println("Math.ceil(a)  = " + Math.ceil(a));  // 3.0
        System.out.println("Math.round(a) = " + Math.round(a)); // 2
        System.out.println();

        System.out.println("Math.floor(b) = " + Math.floor(b)); // 2.0
        System.out.println("Math.ceil(b)  = " + Math.ceil(b));  // 3.0
        System.out.println("Math.round(b) = " + Math.round(b)); // 3
        System.out.println();

        // Casting vs rounding (important confusion point)
        System.out.println("(int)b            = " + (int)b);               // 2 (cuts off)
        System.out.println("(int)Math.round(b)= " + (int)Math.round(b));   // 3 (nearest)
        System.out.println();

        System.out.println("roundTo2Decimals(12.3456) = " + roundTo2Decimals(12.3456));
        System.out.println("clampInt(270)             = " + clampInt(270));
        System.out.println("clampInt(-5)              = " + clampInt(-5));
    }

    // nice extra: rounding to 2 decimals (common “marks / averages” demo)
    private double roundTo2Decimals(double x) {
        return Math.round(x * 100.0) / 100.0;
    }

    // nice extra: clamp into a safe range (connects to RGB clipping)
    private int clampInt(int v) {
        if (v < 0) return 0;
        if (v > 255) return 255;
        return v;
    }
}
