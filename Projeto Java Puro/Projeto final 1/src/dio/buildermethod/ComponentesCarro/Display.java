package dio.buildermethod.ComponentesCarro;

import dio.buildermethod.ObjetosCarro.Carro;

public class Display {
    private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void mostrarCombustivel() {
        System.out.println("Nivel de combustivel: " + carro.getGasolina());
    }

    public void mostrarStatus() {
        if (this.carro.getMotor().isStarted()) {
            System.out.println("Carro esta ligado!");
        } else {
            System.out.println("Carro não esta ligado!");
        }
    }
}
