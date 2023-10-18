package dio.buildermethod.Construtores;

import dio.buildermethod.ComponentesCarro.Display;
import dio.buildermethod.ComponentesCarro.Motor;
import dio.buildermethod.ComponentesCarro.NavegadorGps;
import dio.buildermethod.ComponentesCarro.TipoCarro;

public interface builder {
    void setTipoCarro(TipoCarro tipo);
    void setAssentos(int assentos);
    void setMotor(Motor motor);
    void setDisplay(Display display);
    void setNavegadorGps(NavegadorGps navegadorGps);
}