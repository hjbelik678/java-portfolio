//henry Belik

public class RationalNumberTest {
        public static void main(String[] args) {
            // Create rational numbers
            RationalNumber rational1 = new RationalNumber(3, 5);
            RationalNumber rational2 = new RationalNumber(4, 7);
    
            System.out.println("Rational Number 1: " + rational1.getNumerator() + "/" + rational1.getDenominator());
            System.out.println("Rational Number 2: " + rational2.getNumerator() + "/" + rational2.getDenominator());
    
            
            System.out.println("Rational Number 1 as Double: " + rational1);
            System.out.println("Rational Number 2 as Double: " + rational2);
        }
}