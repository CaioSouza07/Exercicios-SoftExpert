package poo.singleton;

public class PadraoSingleton {

    private static PadraoSingleton instance;

    private PadraoSingleton(){}

    public static PadraoSingleton getInstance(){
        if (instance == null){
            instance = new PadraoSingleton();
        }
        return instance;
    }

}
