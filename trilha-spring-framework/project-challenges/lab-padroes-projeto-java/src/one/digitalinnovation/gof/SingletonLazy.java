package one.digitalinnovation.gof;


/**
 *
 * Singleton "preguiçoso"
 *
 * @author GildeanM
 *
 * */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }

        return instance;

    }


}
