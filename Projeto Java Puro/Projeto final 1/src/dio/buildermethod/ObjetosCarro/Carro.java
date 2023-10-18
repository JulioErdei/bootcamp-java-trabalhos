package dio.buildermethod.ObjetosCarro;

import dio.buildermethod.ComponentesCarro.Display;
import dio.buildermethod.ComponentesCarro.Motor;
import dio.buildermethod.ComponentesCarro.NavegadorGps;
import dio.buildermethod.ComponentesCarro.TipoCarro;

public class Carro {
    private final TipoCarro tipoCarro;
    private final int assentos;
    private final Motor motor;
    private final Display display;
    private final NavegadorGps navegadorGps;
    private double gasolina = 0;

    public Carro(TipoCarro tipoCarro, int assentos, Motor motor, Display display, NavegadorGps navegadorGps, double gasolina) {
        this.tipoCarro = tipoCarro;
        this.assentos = assentos;
        this.motor = motor;
        this.display = display;
        if (this.display != null) {
            this.display.setCarro(this);
        }
        this.navegadorGps = navegadorGps;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public Display getDisplay() {
        return display;
    }

    public Motor getMotor() {
        return motor;
    }

    public int getAssentos() {
        return assentos;
    }

    public double getGasolina() {
        return gasolina;
    }

    public NavegadorGps getNavegadorGps() {
        return navegadorGps;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

}
