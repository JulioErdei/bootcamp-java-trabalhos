package dio.buildermethod.Construtores;

import dio.buildermethod.ComponentesCarro.Display;
import dio.buildermethod.ComponentesCarro.Motor;
import dio.buildermethod.ComponentesCarro.NavegadorGps;
import dio.buildermethod.ComponentesCarro.TipoCarro;
import dio.buildermethod.ObjetosCarro.Carro;

public class CarBuilder implements builder{
    private TipoCarro tipo;
    private int assentos;
    private Motor motor;
    private Display display;
    private NavegadorGps navegadorGps;
    private double gasolina = 0;

    public void setTipoCarro(TipoCarro tipo){
        this.tipo = tipo;
    }

    public void setAssentos(int assentos){
        this.assentos = assentos;
    }

    public void setDisplay(Display display){
        this.display = display;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public void setNavegadorGps(NavegadorGps navegadorGps){
        this.navegadorGps = navegadorGps;
    }

    public Carro getResult() {
        Carro carro = new Carro(tipo, assentos, motor, display, navegadorGps, gasolina);
        return carro;
    }
}
