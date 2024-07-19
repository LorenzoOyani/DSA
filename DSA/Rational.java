package DSA;

public class Rational extends Number implements Comparable<Rational> {

        private int numerator = 0;
        private int denominator = 1;

    Rational(){
        this (0, 1);
    }


    Rational(int numerator, int denominator){
        int gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? -1 : 1)* numerator / gcd;
        this.denominator = Math.abs(denominator) /gcd;

    } 

    int gcd(int numerator, int denominator){
        int n1 = Math.abs(numerator);
        int n2 = Math.abs(denominator);

        int k = 1;
        int gcd = 1;

        for( ; k <= n1 && k <= n2; k++){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
        }

        return gcd;
    }

    public int getDenominator(){
        return denominator;
    }

    

    Rational addRationalNumber(Rational secondRational){
        int n = numerator * secondRational.getDenominator() +
         secondRational.getDenominator() * numerator;
        
        int d = denominator * secondRational.getDenominator();
        

        return new Rational(n, d);
    }


    Rational subtractRational(Rational secondRational){
        int n = 

        return null;
    }

}
