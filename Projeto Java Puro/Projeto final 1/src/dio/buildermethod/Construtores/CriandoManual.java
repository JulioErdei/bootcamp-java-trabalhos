package dio.buildermethod.Construtores;

import dio.buildermethod.ComponentesCarro.Display;
import dio.buildermethod.ComponentesCarro.Motor;
import dio.buildermethod.ComponentesCarro.NavegadorGps;
import dio.buildermethod.ComponentesCarro.TipoCarro;
import dio.buildermethod.ObjetosCarro.ManualCarro;

public class CriandoManual implements builder{
    private TipoCarro tipo;
    private int assentos;
    private Motor motor;
    private Display display;
    private NavegadorGps navegadorGps;

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setNavegadorGps(NavegadorGps navegadorGps) {
        this.navegadorGps = navegadorGps;
    }
    public void setTipoCarro(TipoCarro tipo) {
        this.tipo = tipo;
    }

    public ManualCarro getResult() {
        return new ManualCarro(tipo, assentos, motor, display, navegadorGps);
    }
}
