package complexexample;

/**
 * Nem szálbiztos komplex szám osztály
 */
public class Complex {

    private double re;
    private double im;

    public void set(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double[] get() {
        double[] result = {re, im};
        return result;
    }

}

