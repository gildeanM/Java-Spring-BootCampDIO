package one.digitalinnovation.gof.singleton;


/**
 *
 * Singleton "Lazy Holder"
 *
 * @author GildeanM
 *
 * */
public class SingletonLazyHolder {

    private static class InstanceHolder{
        private static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }


}
