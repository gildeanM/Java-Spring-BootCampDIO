import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Singleton
//        System.out.println("Utilizando Singleton Lazy");
//        SingletonLazy lazy = SingletonLazy.getInstance();
//
//        System.out.println(lazy);
//
//        lazy = SingletonLazy.getInstance();
//
//        System.out.println(lazy);
//
//        System.out.println("Utilizando Singleton Eager");
//        SingletonEager eager = SingletonEager.getInstance();
//
//        System.out.println(eager);
//
//        eager = SingletonEager.getInstance();
//
//        System.out.println(eager);
//
//        System.out.println("Utilizando Singleton Lazy Holder");
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
//
//        System.out.println(lazyHolder);
//
//        lazyHolder = SingletonLazyHolder.getInstance();
//
//        System.out.println(lazyHolder);

        //Strategy
//        Comportamento normal = new ComportamentoNormal();
//        Comportamento agressivo = new ComportamentoAgressivo();
//        Comportamento defensivo = new ComportamentoDefensivo();
//
//        Robo robo = new Robo();
//        robo.setComportamento(normal);
//        robo.mover();
//
//        robo.setComportamento(defensivo);
//        robo.mover();
//
//        robo.setComportamento(agressivo);
//        robo.mover();


    //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Gildean", "2241212");

         
    }
}