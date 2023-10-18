package dio.buildermethod;

import dio.buildermethod.Construtores.CarBuilder;
import dio.buildermethod.Construtores.CriandoManual;
import dio.buildermethod.ObjetosCarro.Carro;
import dio.buildermethod.ObjetosCarro.CriandoCarro;
import dio.buildermethod.ObjetosCarro.ManualCarro;

public class Principal {
    public static void main(String[] args) {
        CriandoCarro director = new CriandoCarro();
        CarBuilder builder = new CarBuilder();
        director.construirCarroEsportivo(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Carro carro = builder.getResult();
        System.out.println("Carro construido:\n" + carro.getTipoCarro());


        CriandoManual manual = new CriandoManual();

        // Director may know several building recipes.
        director.construirCarroEsportivo(manual);
        ManualCarro manualCarro = manual.getResult();
        System.out.println("\nDetalhes do manual de construção:\n" + manualCarro.print());

    }

}