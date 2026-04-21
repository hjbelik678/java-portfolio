public class RationalNumber {
    private int numerator;
    private int denominator;

    // Constructor
    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    public double RationalNumberGet() {
        RationalNumberGet();
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int ratio = numerator / denominator;
        return ratio;
    }
    public int getDenominator() {
        return denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    public String toString() {
        double ratioString = RationalNumberGet();
        return Double.toString(ratioString);
    }

    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        // Ensure negative sign is only in the numerator
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    // Method to find the greatest common divisor
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}