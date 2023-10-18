package dio.buildermethod.ComponentesCarro;

public class NavegadorGps {
    private String rota;

    public NavegadorGps() {
        this.rota = "Navegador sem rota, insira o destino!";
    }

    public NavegadorGps(String rotaManual) {
        this.rota = rotaManual;
    }

    public String getRota() {
        return rota;
    }
}
