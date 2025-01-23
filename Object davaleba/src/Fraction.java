import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Invalid denominator: 0. Defaulting to 1.");
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        return numerator * fraction.denominator == denominator * fraction.numerator;
    }

    @Override
    public int hashCode() {
        return numerator * 50 + denominator;
    }

    @Override
    public String toString() {
        return "Fraction{\n"
                + "\tnumerator= " + numerator + ",\n"
                + "\t dominator= " +denominator + ",\n"
                +  "}";
    }
}
