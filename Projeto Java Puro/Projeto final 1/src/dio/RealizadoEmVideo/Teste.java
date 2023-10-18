package dio.RealizadoEmVideo;

import dio.RealizadoEmVideo.syngleton.SingletonEager;
import dio.RealizadoEmVideo.syngleton.SingletonLazy;
import dio.RealizadoEmVideo.syngleton.SingletonLazyHolder;
import dio.RealizadoEmVideo.facade.Facade;
import dio.RealizadoEmVideo.strategy.Comportamento;
import dio.RealizadoEmVideo.strategy.ComportamentoAgressivo;
import dio.RealizadoEmVideo.strategy.ComportamentoDefensivo;
import dio.RealizadoEmVideo.strategy.ComportamentoNormal;
import dio.RealizadoEmVideo.strategy.Robo;

public class Teste {
    public static void main(String[] args) {
        
        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    
        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("CLIENTE", "121233224");

    
    }
}
