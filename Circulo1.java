public class Circulo1 {

    private double centroX;
    private double centroY;
    private double radio;

    public Circulo1(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }

    public double getCentroX() {
        return centroX;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}

