package dio;

import dio.syngleton.SingletonEager;
import dio.syngleton.SingletonLazy;
import dio.syngleton.SingletonLazyHolder;
import dio.strategy.Comportamento;
import dio.strategy.ComportamentoAgressivo;
import dio.strategy.ComportamentoDefensivo;
import dio.strategy.ComportamentoNormal;
import dio.strategy.Robo;
import dio.facade.Facade;

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
