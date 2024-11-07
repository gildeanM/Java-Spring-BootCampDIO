package one.digitalinnovation.gof.singleton;


/**
 *
 * Singleton "apressado"
 *
 * @author GildeanM
 *
 * */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }


}
