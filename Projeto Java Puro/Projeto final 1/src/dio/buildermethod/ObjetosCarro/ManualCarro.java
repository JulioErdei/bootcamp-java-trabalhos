package dio.buildermethod.ObjetosCarro;

import dio.buildermethod.ComponentesCarro.Display;
import dio.buildermethod.ComponentesCarro.Motor;
import dio.buildermethod.ComponentesCarro.NavegadorGps;
import dio.buildermethod.ComponentesCarro.TipoCarro;

public class ManualCarro {
    private final TipoCarro tipo;
    private final int assentos;
    private final Motor motor;
    private final Display display;
    private final NavegadorGps navegadorGps;

    public ManualCarro(TipoCarro tipo, int assentos, Motor motor, Display display, NavegadorGps navegadorGps) {
        this.tipo = tipo;
        this.assentos = assentos;
        this.motor = motor;
        this.display = display;
        this.navegadorGps = navegadorGps;
    }

    public String print() {
        String info = "";
        info += "Tipo do carro: " + tipo + "\n";
        info += "Quantidade de assentos: " + assentos + "\n";
        info += "Motor: volume - " + motor.getVolume() + "; quilometragem - " + motor.getQuilometros() + "\n";
        if (this.display != null) {
            info += "Display: Funcionando" + "\n";
        } else {
            info += "Display: N/A" + "\n";
        }
        if (this.navegadorGps != null) {
            info += "Navegador GPS: Funcionando" + "\n";
        } else {
            info += "Navegador GPS: N/A" + "\n";
        }
        return info;
    }
}
