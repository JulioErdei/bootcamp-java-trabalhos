package dio.buildermethod.ObjetosCarro;

import dio.buildermethod.ComponentesCarro.Display;
import dio.buildermethod.ComponentesCarro.Motor;
import dio.buildermethod.ComponentesCarro.NavegadorGps;
import dio.buildermethod.ComponentesCarro.TipoCarro;
import dio.buildermethod.Construtores.builder;

public class CriandoCarro{

    public void construirCarroEsportivo(builder builder) {
        builder.setTipoCarro(TipoCarro.Esportivo);
        builder.setAssentos(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setDisplay(new Display());
        builder.setNavegadorGps(new NavegadorGps());
    }

    public void construirCarroLowRider(builder builder) {
    builder.setTipoCarro(TipoCarro.LowRider);
    builder.setAssentos(4);
    builder.setMotor(new Motor(5.0, 0));
    builder.setDisplay(new Display());
    builder.setNavegadorGps(new NavegadorGps());
    }

    public void construirCarroSuv(builder builder) {
    builder.setTipoCarro(TipoCarro.SUV);
    builder.setAssentos(7);
    builder.setMotor(new Motor(2.0, 0));
    builder.setDisplay(new Display());
    builder.setNavegadorGps(new NavegadorGps());
    }

    public void construirCarroSedan(builder builder) {
    builder.setTipoCarro(TipoCarro.Sedan);
    builder.setAssentos(5);
    builder.setMotor(new Motor(1.0, 0));
    builder.setDisplay(new Display());
    builder.setNavegadorGps(new NavegadorGps());
    }
    
}
