import one.digitalinnovation.gof.SingletonEager;
import one.digitalinnovation.gof.SingletonLazy;
import one.digitalinnovation.gof.SingletonLazyHolder;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Utilizando Singleton Lazy");
        SingletonLazy lazy = SingletonLazy.getInstance();

        System.out.println(lazy);

        lazy = SingletonLazy.getInstance();

        System.out.println(lazy);

        System.out.println("Utilizando Singleton Eager");
        SingletonEager eager = SingletonEager.getInstance();

        System.out.println(eager);

        eager = SingletonEager.getInstance();

        System.out.println(eager);

        System.out.println("Utilizando Singleton Lazy Holder");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println(lazyHolder);


    }
}