package dio.buildermethod.ComponentesCarro;

public class Motor {
    private final double volume;
    private double quilometros;
    private boolean ligado;

    public Motor(double volume, double quilometros) {
        this.volume = volume;
        this.quilometros = quilometros;
    }

    public void on() {
        ligado = true;
    }

    public void off() {
        ligado = false;
    }

    public boolean isStarted() {
        return ligado;
    }

    public void go(double quilometros) {
        if (ligado) {
            this.quilometros += quilometros;
        } else {
            System.err.println("Ligue o carro primeiro!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getQuilometros() {
        return quilometros;
    }
}
