package exam2016;

public class Fraction {
	private double numerator = 0;
	private double denominator = 0;
	
	public Fraction() {
		
	}
	
	public Fraction(double nu) {
		numerator = nu;
		denominator = 1;
	}
	
	public Fraction (double nu, double denu) {
		numerator = nu;
		denominator = denu;
	}

	public double getNumerator() {
		return numerator;
	}

	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}

	public double getDenominator() {
		return denominator;
	}

	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}
	
	public Fraction adding(Fraction f) {
		double n1 = this.getNumerator() * f.getDenominator();
		double n2 = this.getDenominator() * f.getNumerator();
		double denu = this.getDenominator() * f.getDenominator();
		
		return new Fraction(n1 + n2, denu);
	}
	
    public Fraction subtracting(Fraction f) {
		double n1 = this.getNumerator() * f.getNumerator();
		double n2 = this.getDenominator() * f.getNumerator();
		double denu = this.getDenominator() * f.getDenominator();
		
		return new Fraction(n1 - n2, denu);
	}
    
    public Fraction reduced(Fraction f) {
    	double gcdNum = gcd(f.getNumerator(), f.getDenominator());
    	
    	return new Fraction(
    			f.getNumerator() / gcdNum,
    			f.getDenominator() / gcdNum);  	
    }
    
    private double gcd(double a, double b) {
        return b == 0 ? a : gcd(b, a % b); // greatest common divisor
    }
	

}
