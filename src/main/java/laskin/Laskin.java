package laskin;

public class Laskin {
    private double tulos;

    public void virtaON() {
        tulos = 0;
    }

    public void virtaOFF() {
        tulos = 0;
    }

    public void nollaa() {
        tulos = 0;
    }

    public void lisaa(double luku) {
        tulos += luku;
    }

    public void vahenna(double luku) {
        tulos -= luku;
    }

    public void kerro(double luku) {
        tulos *= luku;
    }

    public void jaa(double luku) {
        if (luku == 0) {
            throw new ArithmeticException("Nollalla ei voi jakaa");
        }
        tulos /= luku;
    }

    public void nelio(double luku) {
        tulos = luku * luku;
    }

    public void neliojuuri(double luku) {
        if (luku < 0) {
            throw new ArithmeticException("Negatiivisella luvulla ei ole neliöjuurta");
        }
        tulos = Math.sqrt(luku);
    }

    public double annaTulos() {
        return tulos;
    }
}