package J04014;

import java.util.*;

/**
 * Create on 15/10/2024 15:22 by Jayce
 */
public class Fraction {
    private long numerator;
    private long denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction b) {
        long commonDenominator = this.denominator * b.denominator;
        long newNumerator = this.numerator * b.denominator + b.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction multiply(Fraction b) {
        long newNumerator = this.numerator * b.numerator;
        long newDenominator = this.denominator * b.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    private void simplify() {
        long gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public void pow() {
        this.numerator *= this.numerator;
        this.denominator *= this.denominator;
        simplify();
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
