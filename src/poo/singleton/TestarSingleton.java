package poo.singleton;

public class TestarSingleton {
    public static void main(String[] args) {

        //PadraoSingleton padraoSingleton = new PadraoSingleton(); -> Não funciona, construtor privado

        PadraoSingleton padraoSingleton = PadraoSingleton.getInstance();
        PadraoSingleton singleton2 = PadraoSingleton.getInstance();

        System.out.println("Referência do padraoSingleton: " + padraoSingleton + ", e referência do singleton2: " + singleton2 + ", são iguais!");
        System.out.println(padraoSingleton == singleton2);

    }
}
